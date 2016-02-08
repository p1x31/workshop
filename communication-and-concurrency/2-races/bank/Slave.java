public class Slave extends Thread {

    private String name;
    private BankAccount account;
 
    public Slave (String name, BankAccount account) {
        this.name = name;
        this.account = account; 
    }

    private void tell(String message) {
        System.out.println(message);
    }

    public void run () {
	tell("Slave " + name + " got started");

	for (int i = 0; i < 1000000; i++) {
          account.payIn(-1,name);
          account.payIn(1,name);
	}

	tell("Slave " + name + " finished");
    }
}

