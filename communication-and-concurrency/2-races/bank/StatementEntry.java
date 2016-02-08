public class StatementEntry {

  private int amount;
  private String person;

  StatementEntry(int amount, String person) {
    this.amount = amount;
    this.person = person;
  }

  public int getAmount() {
    return amount;
  }

  public String getPerson() {
    return person;
  }
}
