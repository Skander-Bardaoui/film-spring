package tn.esprit.spring.film.restController;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.film.entities.Cinema;
import tn.esprit.spring.film.entities.Salle;
import tn.esprit.spring.film.services.IappService;

import java.util.List;

@RestController
@AllArgsConstructor

public class appController {

    IappService appService;

    @PostMapping("/addC")
    public Cinema ajouterCinema(@RequestBody Cinema c) {
        return appService.ajouterCinema(c);
    }


    @PostMapping("/addwithcinema/{cinemaId}")
    public void ajouterSalleEtAffecterCinema(@RequestBody Salle s,@PathVariable long cinemaId) {
        appService.ajouterSalleEtAffecterCinema(s, cinemaId);
    }


    @PostMapping("/affecter-Film/{filmId}/{salleId}")
    public ResponseEntity<String> affecterFilmASalle(@PathVariable long filmId, @PathVariable long salleId) {
        appService.affecterFilmASalle(filmId, salleId);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/salles/{cinemaId}")
        public List<Salle> ListerSalle(@PathVariable long cinemaId){
            return appService.ListerSalle(cinemaId);

        }
}


