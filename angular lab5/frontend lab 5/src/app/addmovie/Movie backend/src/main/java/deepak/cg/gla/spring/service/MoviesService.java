package deepak.cg.gla.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import deepak.cg.gla.spring.dao.MoviesDao;
import deepak.cg.gla.spring.entity.Movie;

@Transactional
@Service
public class MoviesService {

	@Autowired
	MoviesDao moviesDao;

	public void addMovies(Movie movies) {
		moviesDao.save(movies);
	}

//	public Movies findbyname(String Movie_Name) {
//		return moviesDao.getOne(Movie_Name);
//	}

	public List<Movie> getMovies() {
		List<Movie> movie = new ArrayList<Movie>();
		for (Movie movies : moviesDao.findAll()) {
			movie.add(movies);
		}

		return movie;
	}
}
