package tn.esprit.workshopspring.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.workshopspring.entities.Bloc;
import tn.esprit.workshopspring.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc-rest-controller")
public class BlocRestController {
    IBlocService blocService;
    @PutMapping("/bloc/{id-bloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> numsChambres, @PathVariable("id-bloc") Long idBloc){
        return blocService.affecterChambresABloc(numsChambres,idBloc);
    }
}
