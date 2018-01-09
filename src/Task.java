public class Task {


    String getInfo(Movie movie){
        if (isNull(movie))
            return ""; //referencja do pustego obiektu
        else
        return  "==========\n" +
                movie.getTitle()+"("+movie.getYear()+")\n"+
                movie.getGenre()+" "+movie.getDirector()+"\n"+
                movie.getDescription()+"\n"+
                movie.getRating()+"\n"+
                "==========\n";

    }

    String getInfo(Series series){
        if (isNull(series))
            return ""; //referencja do pustego obiektu
        else
        return "==========\n" +
                series.getTitle()+"\n"+
                series.getGenre()+" "+series.getDirector()+"\n"+
                series.getNumberOfseasons()+" "+series.getNumberOfEpisodes()+"\n"+
                series.getDescription()+"\n"+
                series.getRating()+"\n"+
                "==========\n";

    }

    String getInfo(Actor actor){
        if (isNull(actor))
            return ""; //referencja do pustego obiektu
        else
        return "==========\n" +
                actor.getFirstName()+" "+actor.getLastName()+" "+actor.getCitizenship()+"\n"+
                "==========\n";

    }

    private boolean isNull(Object obj){
        if (obj == null)
            return true;
        else
            return false;

    }
}
