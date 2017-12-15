import java.util.Scanner;

public class ApplicationController {

    private static Scanner sc = new Scanner(System.in);
    private static ConsoleDataReader cdr = new ConsoleDataReader();
    private static  ApplicationDatabase database= new ApplicationDatabase(10);
    private static Task tasker = new Task();

    static void mainLoop(){


        showMenu();

    }

    private static void showMenu(){
        System.out.println("====================");
        System.out.println("FILMUEB");
        System.out.println(" 1: Dodaj film");
        System.out.println(" 2: Dodaj serial");
        System.out.println(" 3: Dodaj aktora");
        System.out.println(" 4: Wyswietl baze filmow");
        System.out.println(" 5: Wyswietl baze seriali");
        System.out.println(" 6: Wyswietl baze aktorow");
        System.out.println(" 7: ZAKONCZ PROGRAM");
        System.out.println("====================");
        System.out.print("Wybierz polecenie: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice != 7){
            select(choice);
        }
        else {
            System.out.println("...koniec programu");
        }

    }

    private static void select(int choice){
        switch (choice){
            case 1: database.addToDatabase(cdr.createMovie());
                    break;
            case 2: database.addToDatabase(cdr.createTvSeries());
                    break;
            case 3: database.addToDatabase(cdr.createActor());
                    break;
            case 4: for (Movie movie : ApplicationDatabase.getMovies()) {
                    System.out.println(tasker.getInfo(movie));
                    }
                    break;
            case 5: for (Series series : ApplicationDatabase.getSeries()) {
                    System.out.println(tasker.getInfo(series));
                    }
                    break;
            case 6: for (Actor actor : ApplicationDatabase.getActors()) {
                    System.out.println(tasker.getInfo(actor));
                    }
                    break;
            default: System.out.println("ZLA LICZBA");

        }
        showMenu();
    }







}
