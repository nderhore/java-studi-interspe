package fr.studi.interspe.ws;

import fr.studi.interspe.pojo.Adherent;
import fr.studi.interspe.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiRegistration.API_REST
        + ApiRegistration.ADHERENT)
@RestController
public class AdherentWs {

    @Autowired
    private AdherentService adherentService;


    @GetMapping
    public List<Adherent> getAllAdherent(){
        return adherentService.getAllAdherent();
    }

    @GetMapping("{id}")
    public Adherent getAdherentById(@PathVariable("id") Long id){
        return adherentService.getAdherentById(id);
    }

    @PostMapping
    public void createAdherent(@RequestBody Adherent adherent){

    }

    @PutMapping("{id}")
    public void updateAdherentById(@RequestBody Adherent adherent,
                                   @PathVariable Long id){

    }

    @DeleteMapping("{id}")
    public void deleteAdherentById(@PathVariable Long id){

    }


}
