public class TestingMethod {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 100;
        account.deposit(50);

        System.out.println(account.balance);

        boolean canWithdraw = account.withdraw(20);

        System.out.println(account.balance);
        System.out.println(canWithdraw);

        Account otherAccount = new Account();
        otherAccount.deposit(1000);

        if (otherAccount.transfer(300, account)) {
           System.out.println("Transfer successfull!");
        } else {
            System.out.println("Not enough money.");
        };

        System.out.println(otherAccount.balance);
        System.out.println(account.balance);
    }
}
