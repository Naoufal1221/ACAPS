package org.acaps.controlmanagement.intermediaire;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;

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
@Table(name = "INTERMEDIAIRE")

public class Intermediaire extends Auditable implements Serializable {




    @Id
    @GeneratedValue
    private Long identifiant;
    private String code;
    private Long quallite;
    private Long formejuridique;
    private Long mandante;
    @Temporal(TemporalType.DATE)
    private Date datedavenant;
    private String nom;
    private Long localite;
    private String adresse;
    private Long longitude;
    private Long latitude;
    @Temporal(TemporalType.DATE)
    private Date dateagrement;
    private String telephone;
    private String telephone2;
    private String fax;
    @Column(unique = true)
    private String email;
    private Long capitalsocial;
    private Long nbrglobalpartsocial;
    private String naturepolicerc;
    private String assureur;

    @OneToMany(mappedBy = "intermediaire",fetch = FetchType.LAZY)
    private List<ScoringIntermediaire> scoringIntermediaires = new ArrayList<>();


}
