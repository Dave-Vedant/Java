package vedant.learningPhase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// set for eliminate duplication;
public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

//======================================================================================

        new Planet("Mars", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);


        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 4.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

//========================================================================================
        temp = new Planet("Jupiter", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

//=================================================================================

        System.out.println("Planet");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey().getName());
        }

        HeavenlyBody check = solarSystem.get(HeavenlyBody.makeKey("Jupiter",HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + check.getKey().getName());
        for (HeavenlyBody jupiterMoon : check.getSatellite()) {
            System.out.println("\t" + jupiterMoon.getKey().getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellite());
        }

        System.out.println("All Moons");
        for (HeavenlyBody allMoon : moons) {
            System.out.println("\t" + allMoon.getKey().getName());
        }

        HeavenlyBody jupiter = new Planet("Jupiter", 34.5);                                       //  OR >>> HeavenlyBody("Jupiter", 34.5, HeavenlyBody.BodyTypes.PLANET);
        planets.add(jupiter);

        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
            //System.out.println("-     -      -         -");
            System.out.println(planet.getKey().getName() + " : " + planet.getOrbital());
            System.out.println("===========================");
        }


        System.out.println("Condition Check");
        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        solarSystem.put(jupiter.getKey(),jupiter);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Jupiter" , HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Jupiter",HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println("========================");
        System.out.println("The solar system contains: ");
        for(HeavenlyBody heavenlyBody : solarSystem.values()){
            System.out.println(heavenlyBody);
        }

//      // Object introduction...
//        Object o = new Object();
//        o.equals(o);
//        "pluto".equals("");


    }
}

