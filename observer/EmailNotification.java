package observer;

public class EmailNotification implements TaskObserver {

    @Override
    public void update(String taskName) {
        System.out.println("Sending email notification for task: " + taskName);
    }
}
