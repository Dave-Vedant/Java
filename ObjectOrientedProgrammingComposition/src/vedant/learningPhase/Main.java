package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "DEll", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Apple", 27 , new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("83-200","Windows", 4,6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");   // This is the composition, where we use path by using . after each class
        thePC.getMotherboard().loadProgram("Windows 1.0"); // Actually load program is connected to mother board not to pc but viea mother board, PC access the load program
        thePC.getTheCase().pressPowerButton();


        // See the PC class for understanding it betterly


    }
}
