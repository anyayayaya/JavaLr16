package lr7.task2;

public class PermanentEmp extends Employee{
    private double bonus;

    public PermanentEmp(String name, String position, double salary, double bonus) {
        super(name, position, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new PremiyaException("Премия не может быть отрицательной");
            }
            return super.calculateSalary() + bonus;
        } catch (PremiyaException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        return 0;
    }
}
