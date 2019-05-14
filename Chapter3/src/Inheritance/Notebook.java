package Inheritance;

public class Notebook extends Computer {
    public double screenSize;
    public double weight;

    public Notebook(String man, String proc, int ram, int disk, double speed,
                    double screen, double weight) {
        super(man, proc, ram, disk, speed);

        screenSize = screen;
        this.weight = weight;
    }

    /*Method Overriding: Modify code inherited from parent class*/
    public String toString() {
        String result = super.toString() +
                "\nScreen Size:  " + screenSize +" inches" +
                "\nWeight: " + weight + " kg";
    }

    public static void main(String[] args) {

        Notebook test = new Notebook("Dell", "i5", 4, 1000,
                3.2, 15.6, 1.2);

        System.out.println("Computer Power: " + test.computerPower());
    }
}
