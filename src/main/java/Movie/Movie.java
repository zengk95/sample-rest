package Movie;

import java.util.ArrayList;
import java.util.List;



public class Movie {


    private final long id;
    private final long rating;
    private final String name;
    private final List<String> genres;

    public Movie(long id, String name){
        this.id = id;
        this.rating = 0;
        this.name = name;
        this.genres = new ArrayList<String>();
    }

    public Movie(long id,  String name, List<String> genres, long rating) {
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.genres = genres;
    }

    public long getId() {
        return id;
    }

    public long getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public List<String> getGenres() {
        return genres;
    }
}
