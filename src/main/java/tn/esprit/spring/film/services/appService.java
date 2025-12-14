package tn.esprit.spring.film.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.film.entities.Cinema;
import tn.esprit.spring.film.entities.Film;
import tn.esprit.spring.film.entities.Salle;
import tn.esprit.spring.film.repositories.CinemaRepositorie;
import tn.esprit.spring.film.repositories.FilmRepositorie;
import tn.esprit.spring.film.repositories.SalleRepositorie;

import java.util.List;


@Service
@AllArgsConstructor


public class appService implements IappService{

    CinemaRepositorie cinemaRepo;
    SalleRepositorie salleRepo;
    FilmRepositorie filmRepo;


    @Override
    public Cinema ajouterCinema(Cinema c) {
        return cinemaRepo.save(c);
    }

    @Override
    public void ajouterSalleEtAffecterCinema(Salle s, long cinemaId) {
        Cinema cinema = cinemaRepo.findById(cinemaId).get();
        s.setCinema(cinema);
        salleRepo.save(s);
    }

    @Override
    public void affecterFilmASalle(long filmId, long salleId) {
        Film film = filmRepo.findById(filmId).get();
        Salle salle = salleRepo.findById(salleId).get();
        film.getSalles().add(salle);
        salle.getFilms().add(film);
        filmRepo.save(film);


    }

    @Override
    public List<Salle> ListerSalle(long cinemaId) {
        Cinema cinema = cinemaRepo.findById(cinemaId).get();
        return salleRepo.findByCinema(cinema);
    }
}
