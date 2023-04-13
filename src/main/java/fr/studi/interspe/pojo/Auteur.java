package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long auteur_id;

    private String prenom;

    private String nom;


    public Auteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Auteur() {
    }

}
