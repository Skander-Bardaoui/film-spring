package tn.esprit.spring.film.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.film.entities.Cinema;
import tn.esprit.spring.film.entities.Salle;

import java.util.List;

@Repository
public interface SalleRepositorie extends JpaRepository<Salle, Long> {
    List<Salle> findByCinema(Cinema cinema);

}
