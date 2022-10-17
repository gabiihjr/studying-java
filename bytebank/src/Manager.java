public class Manager extends Employee {
    private int password;

    public double getBonus() {
        return super.getBonus() + super.salary;
    }
}
