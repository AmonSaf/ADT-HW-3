package o;

public class PermanentSalaryCalculator implements ISalaryCalculator {
    public double calculate(Employee employee) {
        double salary = employee.getBaseSalary() * 1.2;
        System.out.println("Зарплата постоянного сотрудника " + employee.getName() + ": " + salary);
        return salary;
    }
}
