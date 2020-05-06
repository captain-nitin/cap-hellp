package deepak.cg.gla.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import deepak.cg.gla.spring.entity.Movie;

public interface MoviesDao extends JpaRepository<Movie, Integer>{

}
