package s;

public class MainSRP {
    public static void main(String[] args) {
        Order order = new Order("Гитара", 1, 100);
        OrderCalculator calculator = new OrderCalculator();
        PaymentProcessor payment = new PaymentProcessor();
        EmailNotifier notifier = new EmailNotifier();

        double total = calculator.calculateTotalPrice(order);
        System.out.println("Итого: " + total);

        payment.processPayment("Оплата Картой");
        notifier.sendConfirmationEmail("uh87@mail.com");
    }
}
