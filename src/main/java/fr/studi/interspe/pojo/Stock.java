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
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stock_id;

    private String emplacement;

    public Stock(String emplacement) {
        this.emplacement = emplacement;
    }

    public Stock() {
    }


}
