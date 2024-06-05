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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
Long idBloc ;
String nomBloc;
long capaciteBloc;
    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    Set <Chambre> chambres;
}
