package tn.esprit.workshopspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
String nom ;
String adresse;
int telephone;
    @OneToMany(mappedBy = "cinema")
    Set<Salle> salles;

}
