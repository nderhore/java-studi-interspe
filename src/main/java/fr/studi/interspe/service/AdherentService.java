package fr.studi.interspe.service;

import fr.studi.interspe.pojo.Adherent;

import java.util.List;

public interface AdherentService {
    List<Adherent> getAllAdherent();

    Adherent getAdherentById(Long id);

    void deleteAdherentById(Long id);

    void updateAdherentById(Adherent adherent, Long id);

    void createAdherent(Adherent adherent);
}
