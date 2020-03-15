package vedant.learningPhase;

public class Song {                                               // create class
    private String title;
    private double duration;

    public Song(String title, double duration) {                        // create method
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {                               //super...
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override                                                             // use override to use super class's inheritance, (here, String is super
    public String toString() {
        return this.title + ":" + this.duration;                          // this refers the instance variable to its class defined variable
    }
}
