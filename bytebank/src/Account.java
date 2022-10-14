public class Account {
    private double balance;
    int branch;
    int number;
    Client holder;

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

    public double getBalance() {
        return this.balance;
    }
}
