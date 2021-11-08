package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
            List<String> movieList = new ArrayList<>();
            for (Movie actual: movies) {
                for (LocalDateTime actualDateTime: actual.getDateAndTimeWhenPlayed()) {
                    if (actualDateTime.equals(time)) {
                        movieList.add(actual.getTitle());
                    }
                }
            }

    return movieList;
    }
}
