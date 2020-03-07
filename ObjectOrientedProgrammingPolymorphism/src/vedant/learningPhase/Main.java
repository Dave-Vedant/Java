package vedant.learningPhase;

/*
HERE, EVERY CASE HAS EITHER OWN OUTPUT FOR PLOT, OR CUSTOM MODIFICATION IN PLOT OUTPUT EVEN BY OVERRIDE METHOD, OR SOMETIME NO OUTPUT DEFINED
... STILL EVERY THING WORK IN DIFFERENT WAY WITH IN ONE CLASS " MOVIE "...
************ THIS BEHAVIOUR OF CLASS TO WORK DIFFERENTLY IN EVERY DIFFERENT SCENARIO CASE IS CALL "POLYMORPHISM".
... UNDERSTAND PROPERLY
 */
//========================================< Primary class Movie > ==================================================
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot is defined";
    }

    public String getName() {
        return name;
    }
}

//==============================< generate secondary class with super Movie class, with plot methods >======================================

class inception extends Movie{                        // =====================<CASE 1 : SIMPLE STRUCTURE, CUSTOM OUTPUT FOR PLOT > ===============================
    public inception() {
        super("Inception");
    }
    public String plot(){
        return "Your dream may be your true life, and vise-versa !";
    }
}

class whiteHouseDown extends Movie{                           // =====================<CASE 2: SIMPLE STRUCTURE, CUSTOM OUTPUT FOR PLOT > =========================
    public whiteHouseDown() {
        super("whiteHouseDown");
    }
    @Override
    public String plot() {
        return "You may live in unsafe world";
    }
}

class earthLing extends Movie{              //================< CASE 3: OVERRIDE METHOD > ================================
   /*                                             // its default constructor, can modify as below...
    public earthLing(String name) {
        super(name);
    }

    */
    public earthLing() {
        super("earthLing");
    }
    @Override
    public String plot() {
        //return super.plot();                         // possibility of changing output of different plot even with inheritance call super;
        return "Your life is boon of someone, and not only for you!";
    }
}

class dejavu extends Movie {

    public dejavu() {
        super("dejavu");
    }                                      //=======================<CASE 4 : NOT PRIVATE PLOT DEFINED > =============================
    // no plot..                     // Here, we not defined its own plot so it will use super plot statement.
}

//=======================< Running class is working directory class, and generate results> ============================

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 1;i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" +i + " : "+ movie.getName() + "\n" +
                    " plot : " + movie.plot() + "\n");

            System.out.println("Keep Learning, Enjoy Empowering");

        }
    }
//============================< Generate Movie case method to call in Main for execution >==============================
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() *4) +1;
        System.out.println("Random number generated was "+ randomNumber);
        switch(randomNumber){
            case 1:
                return new inception();
            case 2:
                return new whiteHouseDown();
            case 3:
                return new earthLing();
            case 4:
                return new dejavu();
        }
        return null;
    }
}
