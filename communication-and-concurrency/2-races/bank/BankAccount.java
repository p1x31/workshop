import java.util.ArrayList;

public class BankAccount {

  private int balance = 0;
  private ArrayList<StatementEntry> statement = new ArrayList<StatementEntry>();
    
  public synchronized void payIn(int amount, String person) {
    balance += amount;
    statement.add(new StatementEntry(amount,person));
    }

  public int getBalance() {
    return balance;
  }

  public ArrayList<StatementEntry> getStatement() {
    return statement;
  }
}
