package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;

    private String titre;

    private String description;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    private Boolean archive;

}
