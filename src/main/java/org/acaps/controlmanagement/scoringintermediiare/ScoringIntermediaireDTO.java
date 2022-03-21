package org.acaps.controlmanagement.scoringintermediiare;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.intermediaire.Intermediaire;
import org.acaps.controlmanagement.intermediaire.IntermediaireDTO;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringentete.ScoringEnteteDTO;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicator;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicatorDTO;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ScoringIntermediaireDTO extends Auditable {

    private Long identifiant;
    private Long noteglobale;
    private String statut;
    private Date datestatut;
    private ScoringEnteteDTO scoringEnteteDTO;
    private IntermediaireDTO intermediaireDTO;

    private List<ScoringIntermediaireIndicatorDTO>
            scoringIntermediaireIndicatorDTOS = new ArrayList<>();
}
