package strategy;

public class ListViewStrategy implements TaskViewStrategy {
    @Override
    public void display() {
        System.out.println("Displaying tasks in List View");
    }
}
