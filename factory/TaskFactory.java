package factory;

public interface TaskFactory {
    Task createTask(String name, String description, String dueDate);
}
