package vedant.learningPhase;

/*
Good Code Practice:

Why generic: in list type if we do not declare data type then, in case of error we only know at compile time, and during
coding time, we just not get the concern , so QA analyst need to solve it, require more time and manpower, which is costly
,so its better to work with pre concerned method, is called Generic method.

 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseballPlayer vedant = new BaseballPlayer("vedant");
        FootballPlayer dave = new FootballPlayer("dave");
        SoccerPlayer ved  = new SoccerPlayer("ved");

        Team<FootballPlayer> MiamiDolphin = new Team<>("MiamiDolphin");
  //      orcas.addPlayer(ved);
  //      orcas.addPlayer(vedant);//
        MiamiDolphin.addPlayer(dave);
        System.out.println(MiamiDolphin.numPlayer());

        Team<BaseballPlayer> blueWhale = new Team<>("blueWhale");
        blueWhale.addPlayer(vedant);


        // compilation time error only
        Team<SoccerPlayer> brokenTeam = new Team<>("brokenTeam");
        brokenTeam.addPlayer(ved);

        // Scoring calculation;
        // add new players
        Team<FootballPlayer> TorontoRaptors = new Team("TorontoRaptors");
        Team<FootballPlayer> NewYorkGiants = new Team("NewYorkGiants");

        // give points
        TorontoRaptors.matchResult(NewYorkGiants,2,0);
        TorontoRaptors.matchResult(MiamiDolphin,4,0);

        MiamiDolphin.matchResult(TorontoRaptors,4,0);
        MiamiDolphin.matchResult(NewYorkGiants,2,0);

        NewYorkGiants.matchResult(TorontoRaptors,2,2);
        NewYorkGiants.matchResult(MiamiDolphin,10,0);
        System.out.println("===================");




        TorontoRaptors.ranking();
        MiamiDolphin.ranking();
        NewYorkGiants.ranking();
        System.out.println("===========");

        System.out.println(TorontoRaptors.compareTo(MiamiDolphin));
        System.out.println(TorontoRaptors.compareTo(NewYorkGiants));
        System.out.println(NewYorkGiants.compareTo(TorontoRaptors));



    }
}
