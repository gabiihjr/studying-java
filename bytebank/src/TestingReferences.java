public class TestingReferences {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        System.out.println("First account balance: " + firstAccount.getBalance());

        System.out.println("First account balance " + firstAccount.getBalance());

        System.out.println(firstAccount);
    }
}
