public class Task {


    String getInfo(Movie movie){
        return  "==========\n" +
                movie.getTitle()+"("+movie.getYear()+")\n"+
                movie.getGenre()+" "+movie.getDirector()+"\n"+
                movie.getDescription()+"\n"+
                movie.getRating()+"\n"+
                "==========\n";

    }

    String getInfo(Series series){
        return "==========\n" +
                series.getTitle()+"\n"+
                series.getGenre()+" "+series.getDirector()+"\n"+
                series.getNumberOfseasons()+" "+series.getNumberOfEpisodes()+"\n"+
                series.getDescription()+"\n"+
                series.getRating()+"\n"+
                "==========\n";

    }

    String getInfo(Actor actor){
        return "==========\n" +
                actor.getFirstName()+" "+actor.getLastName()+" "+actor.getCitizenship()+"\n"+
                "==========\n";

    }
}
