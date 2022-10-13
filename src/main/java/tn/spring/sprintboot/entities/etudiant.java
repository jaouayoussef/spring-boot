package tn.spring.sprintboot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

enum Option{
    GAMIX,
    SE,
    SIM,
    NIDS
}

@Entity
@Table( name = "Etudiant")
public class etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
// Constructeur et accesseurs (getters) et mutateurs (setters)


    @ManyToOne (cascade = CascadeType.ALL)
    private departement departement;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "etudiant")
    private Set<contrat> contrats;

    @ManyToMany (cascade = CascadeType.ALL)
    private Set<equipe> equipes;
}