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
}
