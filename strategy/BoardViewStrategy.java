package strategy;

public class BoardViewStrategy implements TaskViewStrategy {

    @Override
    public void display() {
        System.out.println("Displaying tasks in Board View");
    }
}
