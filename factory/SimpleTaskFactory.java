package factory;

public class SimpleTaskFactory implements TaskFactory{
    @Override
    public Task createTask(String type, String name, String description, String dueDate) {
        if ("Simple".equals(type)) {
            return new SimpleTask(name, description, dueDate);
        }
        return null;
    }
}
