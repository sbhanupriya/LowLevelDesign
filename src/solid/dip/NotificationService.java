package solid.dip;

public class NotificationService {
    private MessageService messageService;
    public NotificationService(MessageService messageService){
        this.messageService = messageService;
    }
    public void notifyUser(String message){
        messageService.sendMessage(message);
    }

    public static void main(String[] args){
        MessageService messageService = new EmailService();
        NotificationService service = new NotificationService(messageService);
        service.notifyUser("Hello World!!");
    }
}
