package tn.esprit.spring.film.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.film.entities.Cinema;

@Repository
public interface CinemaRepositorie extends JpaRepository<Cinema, Long> {
}
