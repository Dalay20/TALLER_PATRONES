package factory;

public abstract class Task {
    protected String name;
    protected String description;
    protected String dueDate;

    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    public abstract void display();
}
