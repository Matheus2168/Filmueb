public class Filmueb {

    private static String name = "FILMueb";
    private static String version  = "ver. 0.1";

    public static void main(String[] args) {

        System.out.println(name+" "+version);

        Movie mov1 = new Movie("Gladiator",2000,"epic historical drama","Ridley Scott","<descr>",4.9);
        Series srs1 = new Series("House Of Cards","political drama","Beau Willimon",5,65,"<descr>",4.2);
        Actor actor1 = new Actor("Russel","Crowe","New Zealand");

        Task tasker = new Task();

        System.out.println( tasker.getInfo(mov1));
        System.out.println(tasker.getInfo(srs1));
        System.out.println(tasker.getInfo(actor1));


    }
}
