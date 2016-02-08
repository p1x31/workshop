// Usage:
//        java Master name1 name2 name3 ...

public class Master {

    private static void tell(String message) {
        System.out.println(message);
    }

    public static void main(String args[]) {
        tell("Master got started");

        BankAccount account = new BankAccount();

        Thread [] slave = new Thread[args.length];

        for (int i = 0; i < args.length; i++) {
            tell("Master is starting slave " + args[i]);
            slave[i] = new Thread(new Slave(args[i],account));
            slave[i].start();
        }

        tell("Master will now wait for each slave to finish");

        try {
            for (Thread s : slave)
                s.join();
	}
        catch (InterruptedException e) {
            tell("Interruption before completion of the joins" + e);
            tell("Master has given up waiting for slaves");
        }

	tell("Balance should be 0 and actually is " + account.getBalance());

        tell("Statement");

	
        for (StatementEntry e : account.getStatement()) {
          tell(e.getAmount() + " " + e.getPerson());
        }
    
        tell("Master is exiting");
    }
}
