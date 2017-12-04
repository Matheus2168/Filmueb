public class Filmueb {

    private static String name = "FILMueb";
    private static String version  = "ver. 0.2";

    public static void main(String[] args) {

        System.out.println(name+" "+version);


        Task tasker = new Task();
        ConsoleDataReader cdr = new ConsoleDataReader();

        Movie movie1 = cdr.createMovie();
        System.out.println(tasker.getInfo(movie1));

        Series series1 = cdr.createTvSeries();
        System.out.println(tasker.getInfo(series1));

        Actor actor1 = cdr.createActor();
        System.out.println(tasker.getInfo(actor1));



    }
}
