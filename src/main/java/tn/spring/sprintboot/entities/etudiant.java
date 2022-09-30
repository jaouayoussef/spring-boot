package tn.spring.sprintboot.entities;

import javax.persistence.*;
import java.io.Serializable;

enum Option{
    GAMIX,
    SE,
    SIM,
    NIDS
}

@Entity
@Table( name = "Etudiant")
public class etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}