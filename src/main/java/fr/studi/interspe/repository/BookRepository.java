package fr.studi.interspe.repository;

import fr.studi.interspe.pojo.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Livre,Long> {

    List<Livre> findLivresByArchive(Boolean value);
}
