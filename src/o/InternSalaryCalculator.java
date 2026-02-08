package o;

public class InternSalaryCalculator implements ISalaryCalculator {
    public double calculate(Employee employee) {
        double salary = employee.getBaseSalary() * 0.8;
        System.out.println("Зарплата стажёра " + employee.getName() + ": " + salary);
        return salary;
    }
}
