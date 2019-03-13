package Movie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MovieController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/movie")
    public Movie movie(@RequestParam(value = "name", defaultValue = "Titanic") String name,
                       @RequestParam(value = "genre", defaultValue = "") String genres,
                       @RequestParam(value = "rating", defaultValue = "0") String rating) {

        return new Movie(
                counter.incrementAndGet(),
                name,
                new ArrayList<String>(Arrays.asList(genres.split(","))),
                Long.parseLong(rating));
    }
}
