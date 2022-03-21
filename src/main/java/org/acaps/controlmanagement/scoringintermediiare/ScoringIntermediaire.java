package org.acaps.controlmanagement.scoringintermediiare;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.intermediaire.Intermediaire;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicator;
import org.acaps.controlmanagement.users.User;

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

@Table(name = "  SCORING_INTERMEDIAIRE")
public class ScoringIntermediaire extends Auditable implements Serializable {



    @Id
    @GeneratedValue
    private Long identifiant;
    private Long noteglobale;
    private String statut;
    @Temporal(TemporalType.DATE)
    private Date datestatut;


    @ManyToOne
    @JoinColumn(name = "entete")
    private ScoringEntete scoringEntete;

    @ManyToOne
    @JoinColumn(name = "intermediaire")
    private Intermediaire intermediaire;


    @OneToMany(mappedBy = "scoringIntermediaire",fetch = FetchType.LAZY)
    private List<ScoringIntermediaireIndicator>
            scoringIntermediaireIndicators = new ArrayList<>();
}
