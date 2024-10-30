public abstract class  Notification {
    abstract void sendNotification(String Message);
}

class EmailNotification extends Notification{
    @Override
    void sendNotification(String Message) {
        System.out.println(Message + " - sent by email ");

    }

}
class SMSNotification extends Notification {
    @Override
    void sendNotification(String Message) {
        System.out.println(Message + " - sent by sms ");

    }
}

//davaleba2