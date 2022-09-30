package tn.spring.sprintboot.entities;

import javax.persistence.*;
import java.util.Date;

enum Specialite{
    IA,
    RESEAUX,
    CLOUD,
    SECURITE
}
@Entity
@Table( name = "Contrat")
public class contrat{
    @Id
    int idContrat;
    Date dateDebutContrat;
    Date dateFinContrat;
    Specialite specialite;
    boolean archive;
    int montantContrat;


}
