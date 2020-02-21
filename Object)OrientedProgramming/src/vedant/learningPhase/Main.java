package vedant.learningPhase;

public class Main {     //create class method in another windows ; class is blueprint of objects in object oriented programming

    public static void main(String[] args) {
        DataSciencePosition dataAnalyst = new DataSciencePosition();  //initialize object name dataAnalyst by new...
        DataSciencePosition dataEngineer = new DataSciencePosition();

        //dataAnalyst = null;  //* it give null value to pointer initialized and deActive initialization will execute nullException error.

        // let see our method or variables in class
        dataAnalyst.experience = 3;
        /* after . we can see methods, parameters and functions which are either created by us or by java it self;
        if java created some,because of its **inheritance** speciality. */

        //dataAnalyst.sector = "finance";          // due to private variable/function it gives error.

        //* dataAnalyst.levelOfPosition = "Junior";    // give error because its private in  another class
        dataAnalyst.setLevelOfPosition("Junior");     // so, such better way to set parameter value by **set** method generated in another class

        System.out.println("The Level of Position is " + dataAnalyst.getLevelOfPosition());
        dataAnalyst.setLevelOfPosition("Senior");  // set new position and get it...
        System.out.println("The level of position now change to " + dataAnalyst.getLevelOfPosition());

        dataAnalyst.setSector("Sells");
        System.out.println("The working sector is " + dataAnalyst.getSector());
        System.out.println("Give Unknown because our defined class has no sells as valid defined sector, just check it in defined class DataSciencePosition.java");
        System.out.println(" ");
        dataAnalyst.setSector("Finance");
        System.out.println("The working sector is " + dataAnalyst.getSector());
    }
}
