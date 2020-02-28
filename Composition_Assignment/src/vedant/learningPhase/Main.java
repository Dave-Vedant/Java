package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // create my triangle structure for bed room before use bedroom
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Classic",2,5,1,4);
        Lamp lamp = new Lamp("Sun light",true, 4);

        // create bedroom and use upper defined variable directly;
        Bedroom bedroom = new Bedroom("study_room",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        // use composition to access desire output;
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        System.out.println("good night!, have a nice sleep :)");

        System.out.println("");
        System.out.println("Keep Learning, Enjoy Empowering");

    }
}
