package org.acaps.controlmanagement.indicateur.dtos;


import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.criteres.CriteriaDTO;
import org.acaps.controlmanagement.enumuration.FlagBgd;
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
public class IndicatorDTO extends Auditable {

    private Long identifiant;
    private String libelle;
    private String description;
    private Long ponderation;
    private String actif;
    private Date dateDebut;
    private Date dateFin;
    private String traitement;
    private FlagBgd flagBgd;
    private List<CriteriaDTO> criterias = new ArrayList<>();

    private List<ScoringIntermediaireIndicatorDTO>
            scoringIntermediaireIndicators = new ArrayList<>();
}

