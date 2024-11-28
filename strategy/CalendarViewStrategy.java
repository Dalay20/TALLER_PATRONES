package strategy;

public class CalendarViewStrategy implements TaskViewStrategy{
    @Override
    public void display() {
        System.out.println("Displaying tasks in Calendar View");
    }
}
