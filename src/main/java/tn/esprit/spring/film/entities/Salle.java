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
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idSalle;
    String nomSalle;
    int Capacite;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Film> films;

    @ManyToOne
    Cinema cinema;
}
