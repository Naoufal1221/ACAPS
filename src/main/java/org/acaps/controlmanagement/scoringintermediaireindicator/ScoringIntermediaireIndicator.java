package org.acaps.controlmanagement.scoringintermediaireindicator;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.criteres.Criteria;
import org.acaps.controlmanagement.indicateur.Indicator;
import org.acaps.controlmanagement.intermediaire.Intermediaire;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name = "SCORING_INTERMEDIAIRE_INDICATEU")
public class ScoringIntermediaireIndicator extends Auditable implements Serializable {


    @Id
    @GeneratedValue
    private Long identifiant;
    private Long note;
    private String statut;
    @Temporal(TemporalType.DATE)
    private Date datestatut;


    @ManyToOne
    @JoinColumn(name = "scoringintermediaire")
    private ScoringIntermediaire scoringIntermediaire;

    @ManyToOne
    @JoinColumn(name = "indicateur")
    private Indicator indicator;

    @ManyToOne
    @JoinColumn(name = "critere")
    private Criteria criteria;


}
