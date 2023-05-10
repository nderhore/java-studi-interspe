package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Exemplaire {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exemple_id;

    @ManyToOne
    @JoinColumn(name = "usure_id")
    private Usure usure;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre livre;





}
