package tn.spring.sprintboot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

enum Specialite{
    IA,
    RESEAUX,
    CLOUD,
    SECURITE
}
@Entity
@Table( name = "Contrat")
public class contrat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    int idContrat;
    Date dateDebutContrat;
    Date dateFinContrat;
    Specialite specialite;
    boolean archive;
    int montantContrat;

    @ManyToOne
    private etudiant etudiant;
}
