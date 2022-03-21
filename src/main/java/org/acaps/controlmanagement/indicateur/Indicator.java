package org.acaps.controlmanagement.indicateur;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.criteres.Criteria;
import org.acaps.controlmanagement.enumuration.FlagBgd;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicator;

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

@Table(name = "P_INDICATEUR")
public class Indicator extends Auditable implements Serializable {

    @Id
    @GeneratedValue
    private Long identifiant;
    @Column(name = "libelle")
    private String libelle;
    private String description;
    private Long ponderation;
    private String actif;
    @Temporal(TemporalType.DATE)
    @Column(name = "datedebut")
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    @Column(name = "datefin")
    private Date dateFin;
    private String traitement;
    @Enumerated(EnumType.STRING)
    @Column(name = "flgbd")
    private FlagBgd flagBgd;
    @OneToMany(mappedBy = "indicator",fetch = FetchType.LAZY)
    //@JoinColumn(name = "fk_p_criter_reference_p_indica")
    @JsonIgnore
    private List<Criteria> criteriaList = new ArrayList<>();

    @OneToMany(mappedBy = "indicator",fetch = FetchType.LAZY)
    private List<ScoringIntermediaireIndicator>
            scoringIntermediaireIndicatorsList = new ArrayList<>();
}
