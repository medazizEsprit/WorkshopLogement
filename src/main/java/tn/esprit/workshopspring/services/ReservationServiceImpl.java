package tn.esprit.workshopspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.entities.Chambre;
import tn.esprit.workshopspring.repositories.BlocRepo;
import tn.esprit.workshopspring.repositories.ChambreRepo;
import tn.esprit.workshopspring.repositories.ReservationRepo;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{
    BlocRepo blocRepo;
    ChambreRepo chambreRepo;
    ReservationRepo reservationRepo;
    String generateNumRes(long idChambre, long cinEtudiant){
        //numRes = numChambre+nomBloc+AnneUniversitaire
        Chambre chambre = chambreRepo.findById(idChambre).orElse(null);

        if(chambre.getTypeC() == null){}
        return null;
    }
}
