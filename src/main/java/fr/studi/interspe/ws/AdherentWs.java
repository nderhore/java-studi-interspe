package fr.studi.interspe.ws;

import fr.studi.interspe.pojo.Adherent;
import fr.studi.interspe.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiRegistration.API_REST
        + ApiRegistration.ADHERENT)
@RestController // -> je consomme et je renvoi du JSON
// @Controller -> je renvoie du HTML
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
