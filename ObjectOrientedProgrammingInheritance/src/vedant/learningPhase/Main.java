package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {

        animal animal = new animal("pet animal", 1, 1, 5, 8);

        dog dog = new dog("tommy", 4, 2, 2, 10, "Silky", 1);
        dog.eat();              // see here, dog haven't eat method but animal has ,its called INHERITANCE work such a way.

        dog doberman = new dog("puppy", 4,3,3,12,"furry", 3);
        doberman.eat();
        doberman.move(23);

        doberman.walk();   // in class dog dog.walk() has move sentence which redirect it to private move method in dog class >>    RUN IT
        doberman.run();     // where, in class dog >> dog.run() has super.move sentence which direct it to super Inheritance .. animal class  >> RUN IT

    }
}
