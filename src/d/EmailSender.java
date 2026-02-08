package d;

public class EmailSender implements IMessageSender {
    public void send(String message) {
        System.out.println("Почта отправлена: " + message);
    }
}
