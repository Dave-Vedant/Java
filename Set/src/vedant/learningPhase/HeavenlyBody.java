package vedant.learningPhase;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
//    private final String name;     // ...give into key
    private final Key key;
    private final double orbital;
    private final Set<HeavenlyBody> satellites;
//    private final BodyTypes bodyType;      //  ... give into key

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbital, BodyTypes bodyType) {
///        this.name = name;
        this.key = new Key(name,bodyType);      // use Key class to reduce code duplication in equals and hashcode
        this.orbital = orbital;
        this.satellites = new HashSet<>();
//        this.bodyType = bodyType;
    }

//    public String getName() {
//        return name;
//    }

    public double getOrbital() {
        return orbital;
    }

//    public BodyTypes getBodyType() {
//        return bodyType;
//    }

    public Set<HeavenlyBody> getSatellite() {
        return new HashSet<>(this.satellites);

    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Key getKey() {
        return key;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
//            if (this.name.equals(theObject.getName())) {
//                return this.bodyType == theObject.getBodyType();
//            }
        }
        return false;
    }
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass is " + this.getClass());
//        if ((obj == null) || (obj.getClass() != this.getClass())) {         // getClass returns instance of the class.
//            return false;
//        }
//
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
//    }

    @Override
    public int hashCode(){
//        System.out.println("HashCode called")
//        return this.name.hashCode() + 57 + this.bodyType.hashCode();          // because name has hashcode ( and for equal values, go to same bucket and same hashcode...
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + " : " + this.key.bodyType + " , " + this. orbital;
//        return this.name + " : " + this.bodyType + " , " +  this.orbital;
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    public static final class Key{
        private final String name;
        private final BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())){
                return this.bodyType == key.getBodyType();
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyType;
        }
    }
}