package org.acaps.controlmanagement.criteres;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.enumuration.FlagBgd;
import org.acaps.controlmanagement.indicateur.Indicator;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicator;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name = "P_CRITERES")
public class Criteria extends Auditable implements Serializable {

    @Id
    @GeneratedValue
    private Long identifiant;
    private String libelle;
    private String description;
    private Long note;
    @Column(name = "valeurmin")
    private Long valeurMin;
    @Column(name = "valeurmax")
    private Long valeurMax;
    private String actif;
    @Temporal(TemporalType.DATE)
    @Column(name = "datedebut")
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    @Column(name = "datefin")
    private Date dateFin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "indicateur")
    private Indicator indicator;

    @OneToMany(mappedBy = "criteria",fetch = FetchType.LAZY)
    private List<ScoringIntermediaireIndicator>
            scoringIntermediaireIndicators = new ArrayList<>();
}