package transperfect.challenge.recommendation.service;

import java.util.*;

@Service
public class MovieService {
    private static final String MOVIES_ENDPOINT = "https://transperfect.com/movies";
    
    private final RestTemplate restTemplate;

    public MovieService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<Movie> getAllMovies() {
        ResponseEntity<Movie[]> response = restTemplate.getForEntity(MOVIES_ENDPOINT, Movie[].class);
        return Arrays.asList(response.getBody());
    }
}