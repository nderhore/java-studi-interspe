package fr.studi.interspe.pojo.composite;

import jakarta.persistence.Id;

import java.io.Serializable;

public class CompositeBookKey implements Serializable {

    private Long livre_id;

    private Long genre_id;

    public CompositeBookKey(Long livre_id, Long genre_id) {
        this.livre_id = livre_id;
        this.genre_id = genre_id;
    }


}
