package com.example.springbootrest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> getAllMovies() {
        return movieService.getAllMovieService();
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public Movie getMovieById(@PathVariable int id) {
        return movieService.getMovieService(id);
    }

    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public void saveMovie(@RequestBody Movie movie) {
        movieService.saveMovieService(movie);
    }
}
