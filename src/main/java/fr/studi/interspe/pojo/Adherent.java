package fr.studi.interspe.pojo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Adherent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adherent_id;

    private String nom;

    private String prenom;

    private String telephone;

    private String email;

    private Boolean caution;

    public Adherent(String nom, String prenom, String telephone, String email, Boolean caution) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.caution = caution;
    }

    public Adherent() {
    }


}

