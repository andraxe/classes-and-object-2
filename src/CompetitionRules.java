public class CompetitionRules {


    private static  CompetitionRules competitionRules = new CompetitionRules();


    private String competitionRules1 = "Do not copy and paste from stack overflow1";

    private String competitionRules2 ="Learn everyday!";
    private String competitionRules3 ="Be the best team!";




    private CompetitionRules(){

    }


 public static CompetitionRules getInstance(){

     return competitionRules;

 }

    public void printRules(){
        System.out.println("--------------------------------------------");
        System.out.println(this.competitionRules1);
        System.out.println(this.competitionRules2);
        System.out.println(this.competitionRules3);
        System.out.println("--------------------------------------------");
    }
}
