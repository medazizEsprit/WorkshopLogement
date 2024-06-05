package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Etudiant;
@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
}
