package vedant.learningPhase;

public class animal {               // create new class
    private String name;                   // define parameters
    private int brain;
    private int body;
    private int size;
    private int width;

    public animal(String name, int brain, int body, int size, int width) {    //create constructor with common characteristic in all animals
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.width = width;
    }

    public void eat() {                                 // add new common methods and make it public to call main directly// this method is common in all animals
        System.out.println("animal.eat() method is called");
    }

    public void move(int speed) {
        System.out.println("animal.move() is called and speed is " + speed);

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }
}
