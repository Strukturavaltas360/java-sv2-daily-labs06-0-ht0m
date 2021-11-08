package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> DateAndTimeWhenPlayed = new ArrayList<>();


    public Movie(String title, List<LocalDateTime> dateAndTimeWhenPlayed) {
        this.title = title;
        DateAndTimeWhenPlayed = dateAndTimeWhenPlayed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LocalDateTime> getDateAndTimeWhenPlayed() {
        return DateAndTimeWhenPlayed;
    }

    public void setDateAndTimeWhenPlayed(List<LocalDateTime> dateAndTimeWhenPlayed) {
        DateAndTimeWhenPlayed = dateAndTimeWhenPlayed;
    }
}
