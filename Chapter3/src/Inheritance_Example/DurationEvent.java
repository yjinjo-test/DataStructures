package Inheritance_Example;

public class DurationEvent extends CommonEvent {
    public MyDate begin;
    public MyDate end;

    public DurationEvent(String title, MyDate b, MyDate e) {
        super(title);
        begin = b;
        end = e;
    }

    public String toString() {
        return title + ", " + begin.toString() + " ~ " + end.toString();
    }
}
