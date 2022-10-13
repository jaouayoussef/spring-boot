package tn.spring.sprintboot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

enum Niveau{
    JUNIOR,
    SENIOR,
    EXPERT
}
@Entity
@Table( name = "Equipe")
public class equipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Long idEquipe; // Clé primaire
    private String nomEquipe;
    private String description;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    // Constructeur et accesseurs (getters) et mutateurs (setters)

    @OneToOne
    private detailEquipe detailEquipe;

    @ManyToMany (mappedBy = "equipes", cascade = CascadeType.ALL)
    private Set<etudiant> etudiants;
}
