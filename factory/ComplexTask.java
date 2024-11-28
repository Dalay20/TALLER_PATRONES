package factory;

public class ComplexTask extends Task{
    public ComplexTask(String name, String description, String dueDate) {
        super(name, description, dueDate);
    }

    @Override
    public void display() {
        System.out.println("Complex Task: " + name + " - " + description + " - " + dueDate);
    }
}
