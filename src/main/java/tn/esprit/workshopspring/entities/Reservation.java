package tn.esprit.workshopspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    String idReservation;
    LocalDate anneeUniversitaire;
    Boolean estValide;
    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants = new HashSet<>();


}
