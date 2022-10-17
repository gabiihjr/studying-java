public class CheckingAccount extends Account implements Taxable {

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

    @Override
    public double getValueTax() {
        return 0;
    }
}
