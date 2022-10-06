package tn.spring.sprintboot.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "DetailEquipe")

public class detailEquipe implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Long idDetailEquipe; // Clé primaire
    private int salle;
    private String thematique;
}
