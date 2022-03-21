package org.acaps.controlmanagement.users;

import lombok.*;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringentete.ScoringEnteteDTO;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

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
    private String email;
    private boolean isActive;
    private boolean isNotLocked;
    private List<ScoringEnteteDTO> scoringEntetesCancelByDTOS = new ArrayList<>();
    private List<ScoringEnteteDTO> scoringEnteteAssignByDTOS = new ArrayList<>();
}
