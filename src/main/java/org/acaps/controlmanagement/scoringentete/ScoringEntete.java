package org.acaps.controlmanagement.scoringentete;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.indicateur.Indicator;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;
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

@Table(name = "SCORING_ENTETE")
public class ScoringEntete extends Auditable  implements Serializable {

    @Id
    @GeneratedValue
    private Long identifiant;
    @Temporal(TemporalType.DATE)
    @Column(name = "datedebut")
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    @Column(name = "datefin")
    private Date dateFin;
    @Column(name = "statut")
    private String status;
    @Temporal(TemporalType.DATE)
    @Column(name = "dateStatut")
    private Date dateStatus;
    @Column(name = "nombretotal")
    private Long totalNumb;
    @Column(name = "nombretraites")
    private Long numberTrapped;
    @Temporal(TemporalType.DATE)
    @Column(name = "datetraitement")
    private Date dateProcessing;
    @Temporal(TemporalType.DATE)
    @Column(name = "datefintraitement")
    private Date dateEndProcessing;
    @Temporal(TemporalType.DATE)
    @Column(name = "annulele")
    private Date cancels;

    @ManyToOne
    @JoinColumn(name = "annulepar")
    private User userCancelBy;
    @ManyToOne
    @JoinColumn(name = "effectuepar")
    // foreignKey = @ForeignKey(name="xxxxxxx")
    private User userAssignBy;
    @OneToMany(mappedBy = "intermediaire",fetch = FetchType.LAZY)
    private List<ScoringIntermediaire> scoringIntermediaires = new ArrayList<>();

}
