package org.acaps.controlmanagement.intermediaire;

import lombok.*;
import org.acaps.controlmanagement.configuration.Auditable;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaireDTO;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IntermediaireDTO extends Auditable {

    private Long identifiant;
    private String code;
    private Long quallite;
    private Long formejuridique;
    private Long mandante;
    private Date datedavenant;
    private String nom;
    private Long localite;
    private String adresse;
    private Long longitude;
    private Long latitude;
    private Date dateagrement;
    private String telephone;
    private String telephone2;
    private String fax;
    private String email;
    private Long capitalsocial;
    private Long nbrglobalpartsocial;
    private String naturepolicerc;
    private String assureur;
    private List<ScoringIntermediaireDTO> scoringIntermediaireDTOS = new ArrayList<>();



}
