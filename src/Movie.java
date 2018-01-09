public class Movie extends Item{


    private int year;


    public Movie(String title, int year, String genre, String director, String description, double rating) {
        super(title, genre, director, description, rating);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getGenre() {
        return super.getGenre();
    }

    @Override
    public void setGenre(String genre) {
        super.setGenre(genre);
    }

    @Override
    public String getDirector() {
        return super.getDirector();
    }

    @Override
    public void setDirector(String director) {
        super.setDirector(director);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public double getRating() {
        return super.getRating();
    }

    @Override
    public void setRating(double rating) {
        super.setRating(rating);
    }
}
