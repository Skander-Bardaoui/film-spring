package tn.esprit.spring.film.services;

import tn.esprit.spring.film.entities.Cinema;
import tn.esprit.spring.film.entities.Salle;

import java.util.List;

public interface IappService {

    public Cinema ajouterCinema (Cinema c);
    public void ajouterSalleEtAffecterCinema(Salle s, long cinemaId) ;
    public void affecterFilmASalle(long filmId, long salleId) ;
    public List<Salle> ListerSalle(long cinemaId) ;

}
