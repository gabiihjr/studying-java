public class TestingBank {
    public static void main(String[] args) {
        Client gabriela = new Client();
        gabriela.name = "Gabriela Hermenegildo";
        gabriela.cpf = "222.222.222-22";
        gabriela.profession = "Programadora";

        Account gabrielaAccount = new Account();
        gabrielaAccount.deposit(100);

        gabrielaAccount.holder = gabriela;
        System.out.println(gabrielaAccount.holder.name);
    }
}
