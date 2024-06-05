package tn.esprit.workshopspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;
@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer ;
    String nomFoyer ;
    long capaciteFoyer ;
    @OneToOne(mappedBy ="foyer")
            @ToString.Exclude
    Universite universite;
    @OneToMany(mappedBy ="foyer")
    @ToString.Exclude
    Set<Bloc> Blocs;

}
