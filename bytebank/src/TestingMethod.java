public class TestingMethod {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 100;
        account.deposit(50);

        System.out.println(account.balance);
    }
}
