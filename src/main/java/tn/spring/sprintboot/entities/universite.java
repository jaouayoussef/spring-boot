package tn.spring.sprintboot.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Universite")
public class universite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Long idUniv; // Clé primaire
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<departement> departements;
}
