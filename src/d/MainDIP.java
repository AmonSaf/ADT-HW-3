package d;

import java.util.ArrayList;
import java.util.List;

public class MainDIP {
    public static void main(String[] args) {
        List<IMessageSender> senders = new ArrayList<>();
        senders.add(new EmailSender());
        senders.add(new SmsSender());

        NotificationService service = new NotificationService(senders);
        service.sendNotification("Привет! Это уведомление DIP");
    }
}
