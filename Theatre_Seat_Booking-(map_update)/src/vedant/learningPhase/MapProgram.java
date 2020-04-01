package vedant.learningPhase;

import java.util.HashMap;
//import java.util.Map;
public class MapProgram {

    public static void main(String[] args) {

        java.util.Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java first time");
        } else{
            languages.put("Java"," Java put command first time");
            System.out.println("Java successfully added");
        }
        languages.put("Python", "Python first time");
        languages.put("GoLang", "Go first time");
        languages.put("R", "R first time");
        languages.put("Scala","Scala first time");

        if(languages.containsKey("Java")){
            System.out.println("Java already in Map just check by if");
        } else {
            System.out.println("if check absence of Java, added by if else");
        }

        languages.remove("R");
        if(languages.remove("R","R has 8000+ packages")){
            System.out.println("R is removed");
        } else {
            System.out.println("R was not removed");
        }

        languages.replace("Python","Python is most favourite in dev community");
        if(languages.replace("Python","Python first time","Python is most favourite in dev community")){
            System.out.println("R is replaced");
        } else {
            System.out.println("R was not replaced");
        }

        languages.replace("swift", "this could not be replaced");


        System.out.println("==============================================");

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
            System.out.println("upper one checked by for loop!");
        }
    }
}
