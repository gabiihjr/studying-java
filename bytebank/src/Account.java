public class Account {
    double balance;
    int branch;
    int number;
    String holder;

    public void deposit(double value) {
        this.balance = this.balance + value;
    }
}
