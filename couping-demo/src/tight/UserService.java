package tight;

public class UserService {
    NotificationService notificationService = new NotificationService();
    //SMS
    public void notifyUser(String message)
    {
        notificationService.send("Notification hello ");
    }
}
