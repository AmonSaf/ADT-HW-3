package o;

public class MainOCP {
    public static void main(String[] args) {
        Employee emp = new Employee("Аманат", 1000);

        ISalaryCalculator calculator = new PermanentSalaryCalculator();
        calculator.calculate(emp);
    }
}
