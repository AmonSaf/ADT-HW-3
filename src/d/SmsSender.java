package d;

public class SmsSender implements IMessageSender {
    public void send(String message) {
        System.out.println("СМС отправлено: " + message);
    }
}
