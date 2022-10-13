package tn.spring.sprintboot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table (name ="Departement")
public class departement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart; // Clé primaire
    private String nomDepart;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "departement")
    private Set<etudiant> etudiants;
}
