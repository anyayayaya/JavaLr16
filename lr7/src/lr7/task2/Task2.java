package lr7.task2;

public class Task2 {
    public static void main(String[] args) throws Exception{
        Firm firm = new Firm("имя компании");
        Department department = new Department("какое-то отделение", 10);

        Employee employee = new PermanentEmp("имя1", "должность1", 10000, -1000);
        try {
            double salary = employee.calculateSalary();
            System.out.println("Зарплата сотрудника: " + salary);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        Employee employee2 = new ContractEmp("имя2", "должность2", -852);
        try {
            double salary = employee2.calculateSalary();
            System.out.println("Зарплата сотрудника: " + salary);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
