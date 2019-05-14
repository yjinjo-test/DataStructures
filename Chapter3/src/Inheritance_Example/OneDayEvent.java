package Inheritance_Example;

/*when, title*/
public class OneDayEvent {
    public String title;
    public MyDate date;

    public OneDayEvent(String title, MyDate date) {
        this.title = title;
        this.date = date;
    }

    public String toString() {
        return title + ", " + date.toString();
    }

}
