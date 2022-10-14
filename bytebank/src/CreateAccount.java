public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        System.out.println(firstAccount.getBalance());

        Account secondAccount = new Account();

        System.out.println("First account has " + firstAccount.getBalance());
        System.out.println("Second account has " + secondAccount.getBalance());

        System.out.println(firstAccount.branch);
        System.out.println(firstAccount.number);

    }
}
