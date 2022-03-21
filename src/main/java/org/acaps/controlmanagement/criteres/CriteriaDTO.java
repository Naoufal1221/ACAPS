package org.acaps.controlmanagement.criteres;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.indicateur.dtos.IndicatorDTO;
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
public class CriteriaDTO extends Auditable {


    private Long identifiant;
    private String libelle;
    private String description;
    private Long note;
    private Long valeurMin;
    private Long valeurMax;
    private String actif;
    private Date dateDebut;
    private Date dateFin;
    private IndicatorDTO indicatorDTO;
    private List<ScoringIntermediaireIndicatorDTO>
            scoringIntermediaireIndicatorDTOS = new ArrayList<>();


}
