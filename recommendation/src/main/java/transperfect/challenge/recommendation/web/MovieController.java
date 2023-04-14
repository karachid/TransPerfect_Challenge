package transperfect.challenge.recommendation.web;

import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import transperfect.challenge.recommendation.service.MovieService;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/recommendations")
    public List<Movie> getRecommendedMovies(@RequestParam String genre) {
        List<Movie> allMovies = movieService.getAllMovies();
        return allMovies.stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .sorted(Comparator.comparingInt(Movie::getReleaseYear).reversed())
                .collect(Collectors.toList());
    }
}