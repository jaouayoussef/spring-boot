package tn.spring.sprintboot.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Universite")
public class universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Long idUniv; // Clé primaire
    private String nomUniv;
}
