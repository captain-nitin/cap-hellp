package deepak.cg.gla.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import deepak.cg.gla.spring.entity.Movie;
import deepak.cg.gla.spring.service.MoviesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MoviesController {

	@Autowired
	MoviesService moviesService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public void addmovie(@RequestBody Movie movie) {
		moviesService.addMovies(movie);

	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getmovie() {
		return (List<Movie>) moviesService.getMovies();
	}
}
