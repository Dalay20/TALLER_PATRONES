package factory;

public class ComplexTaskFactory implements TaskFactory{
    @Override
    public Task createTask(String type,String name, String description, String dueDate) {
        if (type.equals("Complex")) {
        return new ComplexTask(name, description, dueDate);
        }
       return null; 
    }
    
}
