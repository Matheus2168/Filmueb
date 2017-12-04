public class Series {

    private String title;
    private String genre;
    private String director;
    private int numberOfseasons;
    private int numberOfEpisodes;
    private String description;
    private double rating;


    public Series(String title, String genre, String director, int numberOfseasons, int numberOfEpisodes, String description, double rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.numberOfseasons = numberOfseasons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumberOfseasons() {
        return numberOfseasons;
    }

    public void setNumberOfseasons(int numberOfseasons) {
        this.numberOfseasons = numberOfseasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
