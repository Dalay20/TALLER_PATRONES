package factory;

public class SimpleTask extends Task{
    public SimpleTask(String name, String description, String dueDate) {
        super(name, description, dueDate);
    }

    @Override
    public void display() {
        System.out.println("Simple Task: " + name + " - " + description + " - " + dueDate);
    }
}
