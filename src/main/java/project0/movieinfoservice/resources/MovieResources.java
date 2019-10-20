package project0.movieinfoservice.resources;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project0.movieinfoservice.models.Movies;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResources {

    @RequestMapping("/{movieId}")
    public Movies getMovieInfo(@PathVariable ("movieId") String movieId)
    {
    return new Movies(movieId,"Test1");
    }
}
