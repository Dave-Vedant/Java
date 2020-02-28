package vedant.learningPhase;

public class PC {

    private  Case theCase;


    /*
     here beside int theCase ,we use Case theCase ... shows case join with pc
      every part or method of access can accessed by PC.
     */

    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}

