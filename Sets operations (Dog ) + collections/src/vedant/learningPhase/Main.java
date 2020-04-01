package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
        Dog rover = new Dog("rover");
        Labrador rover2  = new Labrador("rover");

        System.out.println(rover.equals(rover2));
        System.out.println(rover2.equals(rover));
    }
}
