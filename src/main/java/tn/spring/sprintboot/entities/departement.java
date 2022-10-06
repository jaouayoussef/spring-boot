package tn.spring.sprintboot.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table (name ="Departement")
public class departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart; // Clé primaire
    private String nomDepart;
}
