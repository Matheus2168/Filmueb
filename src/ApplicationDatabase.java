public class ApplicationDatabase {

    private static Movie[] movies;
    private static Series[] series;
    private static Actor[] actors;



    public ApplicationDatabase(int size) {
        movies = new Movie[size];
        series = new Series[size];
        actors = new Actor[size];
    }



    public  void addToDatabase(MyData myObject){
        if (myObject instanceof Movie){
            movies [nextEmptyIndex(movies)] = (Movie)myObject;
        }
        else if (myObject instanceof Series){
            series [nextEmptyIndex(series)] = (Series) myObject;
        }
        else if (myObject instanceof Actor){
            actors [nextEmptyIndex(actors)] = (Actor) myObject;
        }
        else {
            System.out.println("Przekazano nieodpowiedni obiekt");
        }

    }

    private int nextEmptyIndex(MyData[] tab){
        int nextEmptyIndex = -1;
        for (int i = 0 ; i < tab.length ; i++){
            if (tab[i] == null && nextEmptyIndex == -1){
                nextEmptyIndex = i;
            }
        }
        return nextEmptyIndex;
    }








    public static Movie[] getMovies() {
        return movies;
    }

    public static Series[] getSeries() {
        return series;
    }

    public static Actor[] getActors() {
        return actors;
    }
}
