package o;

public class ContractSalaryCalculator implements ISalaryCalculator {
    public double calculate(Employee employee) {
        double salary = employee.getBaseSalary() * 1.1;
        System.out.println("Зарплата контрактного сотрудника " + employee.getName() + ": " + salary);
        return salary;
    }
}
