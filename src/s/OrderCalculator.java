package s;

public class OrderCalculator {
    public double calculateTotalPrice(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}
