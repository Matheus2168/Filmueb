import java.util.Locale;
import java.util.Scanner;

public class ConsoleDataReader {

    Scanner scanner = new Scanner(System.in);

    public ConsoleDataReader() {

        scanner.useLocale(Locale.US);

    }

    Movie createMovie(){
        System.out.println("Podaj informacje o nowym filmie");

        System.out.print("Tytul: ");
        String title = scanner.nextLine();
        if (title.length() == 0)
            return (Movie) failedCreation();

        System.out.print("Rok produkcji: ");
        int year = scanner.nextInt();
        if (year < 1500)
            return (Movie)failedCreation();
        scanner.nextLine();

        System.out.print("Gatunek: ");
        String genre = scanner.nextLine();
        if (genre.length() == 0)
            return (Movie) failedCreation();

        System.out.print("Reżyser: ");
        String director = scanner.nextLine();
        if (director.length() == 0)
            return (Movie) failedCreation();

        System.out.print("Opis: ");
        String description = scanner.nextLine();
        if (description.length() == 0)
            return (Movie) failedCreation();

        System.out.print("Ocena: ");
        double rating = scanner.nextDouble();
        if (rating < 0.0)
            return (Movie)failedCreation();
        scanner.nextLine();

        return new Movie(title,year,genre,director,description,rating);

    }

    Series createTvSeries(){

        System.out.println("Podaj informacje o nowym serialu");

        System.out.print("Tytul: ");
        String title = scanner.nextLine();
        if (title.length() == 0)
            return (Series) failedCreation();

        System.out.print("Gatunek: ");
        String genre = scanner.nextLine();
        if (genre.length() == 0)
            return (Series) failedCreation();

        System.out.print("Reżyser: ");
        String director = scanner.nextLine();
        if (director.length() == 0)
            return (Series) failedCreation();

        System.out.print("Ilosc sezonow: ");
        int numberOfSeasons = scanner.nextInt();
        if (numberOfSeasons <0)
            return (Series) failedCreation();
        scanner.nextLine();

        System.out.print("Ilosc odcinkow: ");
        int numberOfEpisodes = scanner.nextInt();
        if (numberOfEpisodes <0)
            return (Series) failedCreation();
        scanner.nextLine();

        System.out.print("Opis: ");
        String description = scanner.nextLine();
        if (description.length() == 0)
            return (Series) failedCreation();

        System.out.print("Ocena: ");
        double rating = scanner.nextDouble();
        if (rating <0)
            return (Series) failedCreation();
        scanner.nextLine();

        return new Series(title,genre,director,numberOfSeasons,numberOfEpisodes,description,rating);

    }

    Actor createActor(){

        System.out.println("Podaj informacje o nowym aktorze");

        System.out.print("Imie: ");
        String firstName = scanner.nextLine();
        if (firstName.length() == 0)
            return (Actor) failedCreation();

        System.out.print("Nazwisko: ");
        String lastName = scanner.nextLine();
        if (lastName.length() == 0)
            return (Actor) failedCreation();

        System.out.print("Kraj pochodzenia: ");
        String citizenship = scanner.nextLine();
        if (citizenship.length() == 0)
            return (Actor) failedCreation();

        return new Actor(firstName,lastName,citizenship);

    }

    private Object failedCreation(){
        System.out.println("( ! ) NIEPOPRAWNE DANE ( ! )");
        System.out.println(" nie udalo sie stworzyc wpisu");

        return null;
    }

}
