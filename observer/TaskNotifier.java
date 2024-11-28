package observer;
import java.util.ArrayList;
import java.util.List;

public class TaskNotifier {
    private List<TaskObserver> observers = new ArrayList<>();

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void sendNotification(String taskName) {
        for (TaskObserver observer : observers) {
            observer.update(taskName);
        }
    }
}
