package tn.esprit.spring.film.entities;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFilm;
    String filmNom;

    @Enumerated(EnumType.STRING)
    Type TypeFilm;

    Date dateProduction;


    @ManyToMany(mappedBy = "films")
    List<Salle> salles;
}
