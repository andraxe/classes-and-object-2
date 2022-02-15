public class Competition {

    public static void main(String[] args) {

CompetitionRules competitionRules = CompetitionRules.getInstance();
competitionRules.printRules();

        Programmer p1 = new Programmer();
        Programmer p2 = new Programmer();
         Team team = new Team();
        team.teamName= "developer";

        team.PrintDetails();


        p1.name = "andrea";
        p1.programmingLanguage = "java";
        p1.yearsOfExperience= 1;

        p1.printProgrammerDetails();

        p2.name = "Giovanni";
        p2.programmingLanguage = "java";
        p2.yearsOfExperience= 0;

        p2.printProgrammerDetails();

        Team teamA = new Team();
        Team teamB = new Team();
        teamA.name = "Red";
        teamB.name = "Blue";
        System.out.println("TeamA: "+ teamA.name );
        System.out.println("TeamB: "+ teamB.name );

       
    }












}
