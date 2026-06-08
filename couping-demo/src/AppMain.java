import Loose.EmailNotificationService;
import Loose.NotificationService;
import Loose.SMSNotificationService;
import tight.UserService;

public class AppMain {
    public static void main(String[] args) {

        //Tight
        UserService userService = new UserService();
        userService.notifyUser("Order placed!!");

        //Loose
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();
        Loose.UserService userServiceLoose = new Loose.UserService(emailService);
        userServiceLoose.notifyUser("Order Processed!");



        /*
        Constructor Injection - Dependency is provided via constructor
        Setter Injection - Dependency is provided via setter method
        Field Injection - Dependency is assigned directly to a field
         */

        Loose.UserService userServiceLooseSetter = new Loose.UserService();
        userServiceLooseSetter.setNotificationService(emailService);  //Setter Injection
        userServiceLooseSetter.notificationService = smsService;  //Field Injection
    }
}
