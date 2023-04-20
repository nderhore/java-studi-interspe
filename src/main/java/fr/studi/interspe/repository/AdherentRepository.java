package fr.studi.interspe.repository;

import fr.studi.interspe.pojo.Adherent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AdherentRepository extends CrudRepository<Adherent,Long> {


    @Query("SELECT a FROM Adherent a")
    List<Adherent> findAllAdherent();


}
