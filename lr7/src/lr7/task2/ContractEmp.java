package lr7.task2;

public class ContractEmp extends Employee{
    public ContractEmp(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            return super.calculateSalary();
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        return 0;
    }
}
