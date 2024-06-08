package tn.esprit.workshopspring.services;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.entities.Foyer;
import tn.esprit.workshopspring.repositories.BlocRepo;
import tn.esprit.workshopspring.repositories.FoyerRepo;

import java.util.List;
@ToString
@Slf4j
@AllArgsConstructor
@Service
public class FoyerServiceImpl implements IFoyerService {
    FoyerRepo foyerRepo;
    BlocRepo blocRepo;

    public Foyer ajouterFoyer(Foyer foyer) {
        log.info(foyer.toString());
        return foyerRepo.save(foyer);

    }

    @Override
    public Foyer ajouterFoyerEnCascadeBlocs(Foyer foyer) {
        foyer.getBlocs().forEach(bloc -> {bloc.setFoyer(foyer);});
        return foyerRepo.save(foyer);
    }

    public Foyer chercherFoyerParId(long id) {
        return foyerRepo.findById(id).orElse(null);

    }

    @Override
    public void supprimerFoyer(Foyer foyer) {
        foyerRepo.delete(foyer);
    }

    @Override
    public void supprimerFoyerParID(long id) {
        foyerRepo.deleteById(id);
    }

    @Override
    public List<Foyer> afficherTout() {
        return foyerRepo.findAll();
    }

    @Override
    public List<Foyer> ajouterFoyers(List<Foyer> foyers) {
        return foyerRepo.saveAll(foyers);
    }

    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer modifierNomFoyer(String nom, long id) {
        Foyer foyer = foyerRepo.findById(id).orElse(null);
        if (foyer != null)
            foyer.setNomFoyer(nom);
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer affecterFoyerABloc(String nomFoyer, Bloc bloc) {
        //1etape recuperation
        Foyer foyer = foyerRepo.findFoyerByNomFoyer(nomFoyer);
        //2etape affectation  suivant la regle parent.setFils
        bloc.setFoyer(foyer);
        //3etape enregistrer
        blocRepo.save(bloc);
        return foyerRepo.findFoyerByNomFoyer(nomFoyer);

    }

    //@Scheduled(fixedRate = 5000)  //toutes les 5 secondes
    //@Scheduled(fixedDelay = 5000) //toutes les 5 secondes + temps de reponse
    //@Scheduled(cron = "5 * * * * *")// La 5eme seconde de chaque minute/heure/jour/mois/année
    @Scheduled(cron = "*/60 * * * * *")
    void recette(){
        log.info("scheduler ALINFO3");
//        for(Foyer foyer : foyerRepo.findAll()){
//            log.info(foyer.toString());
//        }
    }

}
