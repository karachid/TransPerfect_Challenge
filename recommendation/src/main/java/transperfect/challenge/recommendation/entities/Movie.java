package transperfect.challenge.recommendation.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private String director;
    
}