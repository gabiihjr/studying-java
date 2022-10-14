public class TestingWithdrawNegatives {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(200);

        var accountBalance = account.getBalance();
        System.out.println(accountBalance);
    }
}
