public class Series extends Item{

    private int numberOfseasons;
    private int numberOfEpisodes;


    public Series(String title, String genre, String director, int numberOfseasons, int numberOfEpisodes, String description, double rating) {
        super(title, genre, director, description, rating);
        this.numberOfseasons = numberOfseasons;
        this.numberOfEpisodes = numberOfEpisodes;
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
