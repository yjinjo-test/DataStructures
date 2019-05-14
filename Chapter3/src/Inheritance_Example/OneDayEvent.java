package Inheritance_Example;

/*when, title*/
public class OneDayEvent extends CommonEvent {
    public MyDate date;

    public OneDayEvent(String title, MyDate date) {
        super(title);
        this.date = date;
    }

    public String toString() {
        return title + ", " + date.toString();
    }
}
