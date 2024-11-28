package factory;

public class SimpleTask extends Task {
    public SimpleTask(String name, String description, String dueDate) {
        super(name, description, dueDate, "Simple");
    }

    @Override
    public void display() {
        System.out.println("Simple Task: " +  + " - " + description + " - " + dueDate + " - Type: " + type);
    }
}
