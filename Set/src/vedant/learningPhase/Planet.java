package vedant.learningPhase;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbital) {
        super(name, orbital, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
