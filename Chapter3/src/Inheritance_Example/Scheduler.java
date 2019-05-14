package Inheritance_Example;

public class Scheduler {
    /*Polymorphism: link 3 child classes to 1 parent classes so parent class' reference array refer
    an object which has 3 different type of classes*/
    public CommonEvent[] events = new CommonEvent[100];
    public int n = 0;

    public void processCommand() {
        Scanner kb = new Scanner(System.in);
        while(true) {
            System.out.println("$ ");
            String command = kb.next();
            if (command.equals("addEvent")) {

            } else if (command.equals("list")) {

            } else if (command.equals("show")) {

            } else if (command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }

    public static void main(String[] args) {
        /*Since processCommand is not static, you need to make an object first*/
        Scheduler app = new Scheduler();
        app.processCommand();
    }
}
