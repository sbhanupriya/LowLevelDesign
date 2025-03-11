package solid.single;

public class UserService_Inital {
    //violation of SRP, UserService class has 3 responsibilites register, send email, log to db
    public void registerUser(String username, String password) {
        // Register user
    }

    public void sendEmailNotification(String email) {
        // Send email notification
    }

    public void logToDatabase(String log) {
        // Log to the database
    }
}
