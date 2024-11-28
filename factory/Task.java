package factory;

public abstract class Task {
    protected String name;
    protected String description;
    protected String dueDate;
    protected String type;

    public Task(String name, String description, String dueDate, String type) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public abstract void display();
}
