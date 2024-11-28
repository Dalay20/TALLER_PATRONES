package observer;

public class SMSNotification implements TaskObserver {

    @Override
    public void update(String taskName) {
        System.out.println("Sending SMS notification for task: " + taskName);
    }
}