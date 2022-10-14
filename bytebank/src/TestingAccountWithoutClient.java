public class TestingAccountWithoutClient {
    public static void main(String[] args) {
        Account secondAccount = new Account();

        secondAccount.holder = new Client();
        secondAccount.holder.name = "Marceline";
        System.out.println(secondAccount.holder.name);

    }
}
