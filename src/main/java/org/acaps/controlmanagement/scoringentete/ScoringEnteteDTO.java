package org.acaps.controlmanagement.scoringentete;


import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaireDTO;
import org.acaps.controlmanagement.users.User;
import org.acaps.controlmanagement.users.UserDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ScoringEnteteDTO extends Auditable {

    private Long identifiant;

    private Date dateDebut;

    private Date dateFin;

    private String status;

    private Date dateStatus;

    private Long totalNumb;
    private Long numberTrapped;
    private Date dateProcessing;
    private Date dateEndProcessing;
    private Date cancels;


    private UserDTO userCancelByDTO;

    private UserDTO userAssignByDTO;

    private List<ScoringIntermediaireDTO> scoringIntermediaireDTOS = new ArrayList<>();
}
