package org.acaps.controlmanagement.users;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "UTILISATEUR")
public class User extends Auditable implements Serializable {

    @Id
    @GeneratedValue
    private Long identifiant;
    private String nom;
    private String prenom;
    private String login;
    private String motdepasse;
    private String typeUtilisateur;
    private Long entite;
    private Long intermediaire;
    private Long emploi;
    private String statut;
    private String motdepasseexpire;
    private String responsable;
    @Column(unique = true)
    private String email;
    private boolean isActive;
    private boolean isNotLocked;
    @OneToMany(mappedBy = "userCancelBy",fetch = FetchType.LAZY)
    private List<ScoringEntete> scoringEntetesCancelBy = new ArrayList<>();
    @OneToMany(mappedBy = "userAssignBy",fetch = FetchType.LAZY)
    private List<ScoringEntete> scoringEntetesAssignBy = new ArrayList<>();


}
