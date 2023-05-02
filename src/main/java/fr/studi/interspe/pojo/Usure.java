package fr.studi.interspe.pojo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usure_id;

    private String nom;

    public Usure(String nom) {
        this.nom = nom;
    }

    public Usure() {
    }
}
