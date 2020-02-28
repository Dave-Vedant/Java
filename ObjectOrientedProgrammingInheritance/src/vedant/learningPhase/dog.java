package vedant.learningPhase;

public class dog extends animal {

    private int eyes;            // these are specific part of dog because every animal does not have all things
    private int teeth;
    private String coat;
    private int tail;

    /*
    public dog(String name, int brain, int body, int size, int width) {   // self made constructor ( was in process)
     super(name, brain, body, size, width);
    }
     */


    public dog(String name,  int size, int width, int eyes, int teeth, String coat, int tail) {   // we specified value of some parameter because by default every dog have one body and one brain only
        super(name, 1, 1, size, width);
        this.eyes = eyes;
        this.teeth = teeth;
        this.coat = coat;
        this.tail = tail;
    }
    private void chew(){
        System.out.println("dog.chew() is called");
    }

    protected void walk(){
        System.out.println("dog.walk() is called");
        move(5);
    }

    protected void run() {
        System.out.println("dog.run() is called ");
        super.move(10);
    }


    private void legMoving(int speed){
        System.out.println("dog.legMoving() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dob.move() is called");
        legMoving(speed);
        super.move(speed);
    }




    @Override                  //this is override method because dog has its own chewing method.
    public void eat() {                                    // dog's private eat method...
        System.out.println("dog.eat() method is called");
        chew();                                            // called chew()
        super.eat();                                   // this is super which refer super class, for dog class super is animal so animal.eat() will execute.
    }
}
