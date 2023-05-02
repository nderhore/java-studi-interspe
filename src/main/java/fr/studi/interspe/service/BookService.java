package fr.studi.interspe.service;

import fr.studi.interspe.pojo.Livre;
import fr.studi.interspe.pojo.Status;

import java.util.List;

public interface BookService {
    List<Livre> getAllBooksByState(Status status);

    List<Livre> getAllLivres();

    Livre getLivreById(Long id);
}
