public class CheckingAccount extends Account{

    public CheckingAccount() {
        super();
        //traz o construtor da classe mãe
    }

    @Override
    // sobrescreve a função da classe mãe
    public boolean withdraw(double value) {
        double valueToWithdraw = value + 0.2;
        return super.withdraw(valueToWithdraw);
    }
}
