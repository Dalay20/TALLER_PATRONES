package factory;

public interface TaskFactory {
    Task createTask(String type, String name, String description, String dueDate);
}
