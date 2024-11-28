package factory;

public class ComplexTaskFactory implements TaskFactory{
    @Override
    public Task createTask(String name, String description, String dueDate) {
        return new ComplexTask(name, description, dueDate);
    }
}
