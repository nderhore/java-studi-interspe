package fr.studi.interspe.service.impl;

import fr.studi.interspe.pojo.Adherent;
import fr.studi.interspe.repository.AdherentRepository;
import fr.studi.interspe.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdherentServiceImpl implements AdherentService {

    @Autowired
    private AdherentRepository adherentRepository;

    @Override
    public List<Adherent> getAllAdherent() {
        return adherentRepository.findAllAdherent();
    }

    @Override
    public Adherent getAdherentById(Long id) {
        return adherentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAdherentById(Long id) {
        adherentRepository.deleteById(id);
    }

    @Override
    public void updateAdherentById(Adherent adherent, Long id) {
            // un enregistement est immuable
            // impossible à modifier
            // de ce fait, on doit recuperer l'element, le modifier
            // le remettre
        Adherent oldAdherent = getAdherentById(id);

        if(oldAdherent != null){
            oldAdherent.setNom(adherent.getNom());
            oldAdherent.setPrenom(adherent.getPrenom());
            oldAdherent.setEmail(adherent.getEmail());
            oldAdherent.setCaution(adherent.getCaution());
            adherentRepository.save(oldAdherent);
        }
    }

    @Override
    public void createAdherent(Adherent adherent) {
        adherentRepository.save(adherent);
    }
}
