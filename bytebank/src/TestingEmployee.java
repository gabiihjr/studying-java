public class TestingEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Nome");
        employee.setCpf("222.222.222.65");
        employee.setSalary(2000.00);

        System.out.println(employee.getName());
        System.out.println(employee.getBonus());
    }
}
