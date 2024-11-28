package facade;

import factory.Task;
import factory.TaskFactory;
import observer.TaskNotifier;
import strategy.TaskViewStrategy;

public class TaskManagerFacade {
    private TaskFactory taskFactory;
    private TaskViewStrategy viewStrategy;
    private TaskNotifier taskNotifier;

    public TaskManagerFacade(TaskFactory taskFactory, TaskViewStrategy viewStrategy, TaskNotifier taskNotifier) {
        this.taskFactory = taskFactory;
        this.viewStrategy = viewStrategy;
        this.taskNotifier = taskNotifier;
    }

    public Task createTask(String type, String name, String description, String dueDate) {
        return taskFactory.createTask(type, name, description, dueDate);
    }
   

    public void displayTasks() {
        viewStrategy.display();
    }

    public void sendNotification(String taskName) {
        taskNotifier.sendNotification(taskName);
    }
}
