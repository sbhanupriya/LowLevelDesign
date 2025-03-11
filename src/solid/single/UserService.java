package solid.single;

public class UserService {
    private LoggingService loggingService;
    private EmailService emailService;
    public UserService(LoggingService loggingService, EmailService emailService){
        this.emailService = emailService;
        this.loggingService = loggingService;
    }
    public void registerUser(String username, String password) {
        // Register user
        loggingService.logToDatabase("User Registered");
        emailService.sendEmailNotification("User Registered");
    }

}
