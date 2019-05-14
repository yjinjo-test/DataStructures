package Inheritance_Example;

public class DeadlinedEvent extends CommonEvent {
    public MyDate deadline;

    public DeadlinedEvent(String title, MyDate date) {
        super(title);
        this.deadline = date;
    }

    public String toString() {
        return title + ", " + deadline.toString();
    }
}
