public class Account {
    double balance;
    int branch;
    int number;
    String holder;

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account receiver) {
        if (this.balance >= value) {
            this.balance -= value;
            receiver.deposit(value);
            return true;
        }
        return false;
    }
}
