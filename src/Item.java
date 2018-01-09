public abstract class Item {

    private String title;
    private String genre;
    private String director;
    private String description;
    private double rating;

    public Item(String title, String genre, String director, String description, double rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.description = description;
        this.rating = rating;
    }

    protected Item() {
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
