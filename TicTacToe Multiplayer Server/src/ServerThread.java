/**
 * Created by Vadim on 09/02/2016.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket client = null;
    private ServerThread otherParty = null;
    private Scanner in = null;
    private PrintWriter out = null;
    private String sourceIP = null;
    private boolean active = true;

    public ServerThread(Socket clientSocket) {
        try {
            client = clientSocket;
            String temp = client.getInetAddress().toString();

            sourceIP = temp.replaceAll("/", "");

            in = new Scanner(client.getInputStream());
            out = new PrintWriter(client.getOutputStream());
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // Connect one party to the other
    public void connect(ServerThread other) {
        this.otherParty = other;
    }

    // Return the IP address of the party attached to this thread
    public String getIPAddress() {
        return sourceIP;
    }

    // Returns the state of the thread (active or not)
    public boolean isActive() {
        return active;
    }

    public void begin() {
        out.println("BEGIN");
        out.flush();
    }

    // Send the data to the other party
    public void sendData(String data) {
        out.println(data);
        out.flush();
    }

    // Deactivate the current thread
    public void stop() {
        active = false;

        try {
            client.close();
        }
        catch (IOException e) {
            System.err.println("ServerThread/stop(): Could not close the socket");
        }
        out.close();
        in.close();
    }

    @Override
    public void run() {
        while (active) {
            if (in.hasNextLine()) {
                String str = in.nextLine();
                System.out.println(str);

                if(otherParty != null) { otherParty.sendData(str); }

                // Client has closed the game
                if (str.equals("354")) {
                    stop();
                    return;
                }
            }
        }
    }
}