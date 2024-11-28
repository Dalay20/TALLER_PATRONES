package factory;

public class SimpleTaskFactory implements TaskFactory{
    @Override
    public Task createTask(String name, String description, String dueDate) {
        return new SimpleTask(name, description, dueDate);
    }
}
