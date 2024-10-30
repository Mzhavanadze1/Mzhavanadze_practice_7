public class Gamshvebi2 {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        NotificationService.sendAlert (email,"Email Alert");
        NotificationService.sendAlert(sms, "SMS Alert" );
    }
}
//davaleba2