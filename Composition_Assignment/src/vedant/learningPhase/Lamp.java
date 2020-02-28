package vedant.learningPhase;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRation;

    public Lamp(String style, boolean battery, int globRation) {
        this.style = style;
        this.battery = battery;
        this.globRation = globRation;
    }

    // make one method...
    public void turnOn(){
        System.out.println("-- lamp ---> turnOff");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRation() {
        return globRation;
    }
}
