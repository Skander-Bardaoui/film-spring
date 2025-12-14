package tn.esprit.spring.film.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.film.entities.Film;

@Repository
public interface FilmRepositorie extends JpaRepository<Film, Long> {
}
