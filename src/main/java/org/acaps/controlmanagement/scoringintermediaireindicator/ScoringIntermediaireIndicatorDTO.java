package org.acaps.controlmanagement.scoringintermediaireindicator;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.criteres.Criteria;
import org.acaps.controlmanagement.criteres.CriteriaDTO;
import org.acaps.controlmanagement.indicateur.Indicator;
import org.acaps.controlmanagement.indicateur.dtos.IndicatorDTO;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaireDTO;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ScoringIntermediaireIndicatorDTO extends Auditable {

    private Long identifiant;
    private Long note;
    private String statut;
    private Date datestatut;

    private ScoringIntermediaireDTO scoringIntermediaireDTO;

    private IndicatorDTO indicatorDTO;

    private CriteriaDTO criteriaDTO;
}
