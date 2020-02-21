package vedant.learningPhase;

public class DataSciencePosition {
    public int positions;      // opening positions
    private String sector;     // finance , marketing, security
    public int salary;          // 0 to 1000000
    public int experience;      // 0 to 30
    private String levelOfPosition;   // junior or senior

    // create method
    public void setLevelOfPosition(String levelOfPosition){
        this.levelOfPosition = levelOfPosition;  // refer java that update our variable data ...
                                                  //...with information of method data given.
    }

    public  String getLevelOfPosition(){
        return this.levelOfPosition;
    }
    //===================================================================================================================================================

    // we want sector for finance, and marketing only, no need to give search about hr, sells, risk so ...we need to put such condition in our logic
    public void setSector(String sector) {
        String validSector = sector.toLowerCase();
        if (validSector.equals("finance") || validSector.equals("marketing")) {        //if (validSector == "finance" || validSector == "marketing" ---can not use this !
            this.sector = sector;
        } else {
            this.sector = "Unknown";
        }
    }

    public String getSector(){
        return this.sector;
    }
}
