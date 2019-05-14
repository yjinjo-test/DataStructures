package Inheritance_Example;

public class DeadlinedEvent {
    public String title;
    public MyDate deadline;

    public DeadlinedEvent(String title, MyDate date) {
        this.title = title;
        this.deadline = date;
    }

    public String toString() {
        return title + ", " + deadline.toString();
    }
}
