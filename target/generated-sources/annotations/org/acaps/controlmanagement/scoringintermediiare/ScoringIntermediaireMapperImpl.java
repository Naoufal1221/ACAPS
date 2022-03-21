package org.acaps.controlmanagement.scoringintermediiare;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.acaps.controlmanagement.intermediaire.Intermediaire;
import org.acaps.controlmanagement.intermediaire.IntermediaireDTO;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringentete.ScoringEnteteDTO;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicator;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicatorDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-21T11:12:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class ScoringIntermediaireMapperImpl implements ScoringIntermediaireMapper {

    @Override
    public ScoringIntermediaireDTO toDTO(ScoringIntermediaire scoringIntermediaire) {
        if ( scoringIntermediaire == null ) {
            return null;
        }

        ScoringIntermediaireDTO scoringIntermediaireDTO = new ScoringIntermediaireDTO();

        scoringIntermediaireDTO.setScoringEnteteDTO( scoringEnteteToScoringEnteteDTO( scoringIntermediaire.getScoringEntete() ) );
        scoringIntermediaireDTO.setIntermediaireDTO( intermediaireToIntermediaireDTO( scoringIntermediaire.getIntermediaire() ) );
        scoringIntermediaireDTO.setScoringIntermediaireIndicatorDTOS( scoringIntermediaireIndicatorListToScoringIntermediaireIndicatorDTOList( scoringIntermediaire.getScoringIntermediaireIndicators() ) );
        scoringIntermediaireDTO.setCreationPar( scoringIntermediaire.getCreationPar() );
        scoringIntermediaireDTO.setDateCreation( scoringIntermediaire.getDateCreation() );
        scoringIntermediaireDTO.setModifierPar( scoringIntermediaire.getModifierPar() );
        scoringIntermediaireDTO.setDateModification( scoringIntermediaire.getDateModification() );
        scoringIntermediaireDTO.setIdentifiant( scoringIntermediaire.getIdentifiant() );
        scoringIntermediaireDTO.setNoteglobale( scoringIntermediaire.getNoteglobale() );
        scoringIntermediaireDTO.setStatut( scoringIntermediaire.getStatut() );
        scoringIntermediaireDTO.setDatestatut( scoringIntermediaire.getDatestatut() );

        return scoringIntermediaireDTO;
    }

    @Override
    public List<ScoringIntermediaireDTO> toDTOs(List<ScoringIntermediaire> scoringIntermediaires) {
        if ( scoringIntermediaires == null ) {
            return null;
        }

        List<ScoringIntermediaireDTO> list = new ArrayList<ScoringIntermediaireDTO>( scoringIntermediaires.size() );
        for ( ScoringIntermediaire scoringIntermediaire : scoringIntermediaires ) {
            list.add( toDTO( scoringIntermediaire ) );
        }

        return list;
    }

    @Override
    public ScoringIntermediaire toEntity(ScoringIntermediaireDTO scoringIntermediaireDTO) {
        if ( scoringIntermediaireDTO == null ) {
            return null;
        }

        ScoringIntermediaire scoringIntermediaire = new ScoringIntermediaire();

        scoringIntermediaire.setScoringEntete( scoringEnteteDTOToScoringEntete( scoringIntermediaireDTO.getScoringEnteteDTO() ) );
        scoringIntermediaire.setIntermediaire( intermediaireDTOToIntermediaire( scoringIntermediaireDTO.getIntermediaireDTO() ) );
        scoringIntermediaire.setScoringIntermediaireIndicators( scoringIntermediaireIndicatorDTOListToScoringIntermediaireIndicatorList( scoringIntermediaireDTO.getScoringIntermediaireIndicatorDTOS() ) );
        scoringIntermediaire.setCreationPar( scoringIntermediaireDTO.getCreationPar() );
        scoringIntermediaire.setDateCreation( scoringIntermediaireDTO.getDateCreation() );
        scoringIntermediaire.setModifierPar( scoringIntermediaireDTO.getModifierPar() );
        scoringIntermediaire.setDateModification( scoringIntermediaireDTO.getDateModification() );
        scoringIntermediaire.setIdentifiant( scoringIntermediaireDTO.getIdentifiant() );
        scoringIntermediaire.setNoteglobale( scoringIntermediaireDTO.getNoteglobale() );
        scoringIntermediaire.setStatut( scoringIntermediaireDTO.getStatut() );
        scoringIntermediaire.setDatestatut( scoringIntermediaireDTO.getDatestatut() );

        return scoringIntermediaire;
    }

    @Override
    public List<ScoringIntermediaire> toEntities(List<ScoringIntermediaireDTO> scoringIntermediaireDTOS) {
        if ( scoringIntermediaireDTOS == null ) {
            return null;
        }

        List<ScoringIntermediaire> list = new ArrayList<ScoringIntermediaire>( scoringIntermediaireDTOS.size() );
        for ( ScoringIntermediaireDTO scoringIntermediaireDTO : scoringIntermediaireDTOS ) {
            list.add( toEntity( scoringIntermediaireDTO ) );
        }

        return list;
    }

    protected ScoringEnteteDTO scoringEnteteToScoringEnteteDTO(ScoringEntete scoringEntete) {
        if ( scoringEntete == null ) {
            return null;
        }

        ScoringEnteteDTO scoringEnteteDTO = new ScoringEnteteDTO();

        scoringEnteteDTO.setCreationPar( scoringEntete.getCreationPar() );
        scoringEnteteDTO.setDateCreation( scoringEntete.getDateCreation() );
        scoringEnteteDTO.setModifierPar( scoringEntete.getModifierPar() );
        scoringEnteteDTO.setDateModification( scoringEntete.getDateModification() );
        scoringEnteteDTO.setIdentifiant( scoringEntete.getIdentifiant() );
        scoringEnteteDTO.setDateDebut( scoringEntete.getDateDebut() );
        scoringEnteteDTO.setDateFin( scoringEntete.getDateFin() );
        scoringEnteteDTO.setStatus( scoringEntete.getStatus() );
        scoringEnteteDTO.setDateStatus( scoringEntete.getDateStatus() );
        scoringEnteteDTO.setTotalNumb( scoringEntete.getTotalNumb() );
        scoringEnteteDTO.setNumberTrapped( scoringEntete.getNumberTrapped() );
        scoringEnteteDTO.setDateProcessing( scoringEntete.getDateProcessing() );
        scoringEnteteDTO.setDateEndProcessing( scoringEntete.getDateEndProcessing() );
        scoringEnteteDTO.setCancels( scoringEntete.getCancels() );

        return scoringEnteteDTO;
    }

    protected IntermediaireDTO intermediaireToIntermediaireDTO(Intermediaire intermediaire) {
        if ( intermediaire == null ) {
            return null;
        }

        IntermediaireDTO intermediaireDTO = new IntermediaireDTO();

        intermediaireDTO.setCreationPar( intermediaire.getCreationPar() );
        intermediaireDTO.setDateCreation( intermediaire.getDateCreation() );
        intermediaireDTO.setModifierPar( intermediaire.getModifierPar() );
        intermediaireDTO.setDateModification( intermediaire.getDateModification() );
        intermediaireDTO.setIdentifiant( intermediaire.getIdentifiant() );
        intermediaireDTO.setCode( intermediaire.getCode() );
        intermediaireDTO.setQuallite( intermediaire.getQuallite() );
        intermediaireDTO.setFormejuridique( intermediaire.getFormejuridique() );
        intermediaireDTO.setMandante( intermediaire.getMandante() );
        intermediaireDTO.setDatedavenant( intermediaire.getDatedavenant() );
        intermediaireDTO.setNom( intermediaire.getNom() );
        intermediaireDTO.setLocalite( intermediaire.getLocalite() );
        intermediaireDTO.setAdresse( intermediaire.getAdresse() );
        intermediaireDTO.setLongitude( intermediaire.getLongitude() );
        intermediaireDTO.setLatitude( intermediaire.getLatitude() );
        intermediaireDTO.setDateagrement( intermediaire.getDateagrement() );
        intermediaireDTO.setTelephone( intermediaire.getTelephone() );
        intermediaireDTO.setTelephone2( intermediaire.getTelephone2() );
        intermediaireDTO.setFax( intermediaire.getFax() );
        intermediaireDTO.setEmail( intermediaire.getEmail() );
        intermediaireDTO.setCapitalsocial( intermediaire.getCapitalsocial() );
        intermediaireDTO.setNbrglobalpartsocial( intermediaire.getNbrglobalpartsocial() );
        intermediaireDTO.setNaturepolicerc( intermediaire.getNaturepolicerc() );
        intermediaireDTO.setAssureur( intermediaire.getAssureur() );

        return intermediaireDTO;
    }

    protected ScoringIntermediaireIndicatorDTO scoringIntermediaireIndicatorToScoringIntermediaireIndicatorDTO(ScoringIntermediaireIndicator scoringIntermediaireIndicator) {
        if ( scoringIntermediaireIndicator == null ) {
            return null;
        }

        ScoringIntermediaireIndicatorDTO scoringIntermediaireIndicatorDTO = new ScoringIntermediaireIndicatorDTO();

        scoringIntermediaireIndicatorDTO.setCreationPar( scoringIntermediaireIndicator.getCreationPar() );
        scoringIntermediaireIndicatorDTO.setDateCreation( scoringIntermediaireIndicator.getDateCreation() );
        scoringIntermediaireIndicatorDTO.setModifierPar( scoringIntermediaireIndicator.getModifierPar() );
        scoringIntermediaireIndicatorDTO.setDateModification( scoringIntermediaireIndicator.getDateModification() );
        scoringIntermediaireIndicatorDTO.setIdentifiant( scoringIntermediaireIndicator.getIdentifiant() );
        scoringIntermediaireIndicatorDTO.setNote( scoringIntermediaireIndicator.getNote() );
        scoringIntermediaireIndicatorDTO.setStatut( scoringIntermediaireIndicator.getStatut() );
        scoringIntermediaireIndicatorDTO.setDatestatut( scoringIntermediaireIndicator.getDatestatut() );

        return scoringIntermediaireIndicatorDTO;
    }

    protected List<ScoringIntermediaireIndicatorDTO> scoringIntermediaireIndicatorListToScoringIntermediaireIndicatorDTOList(List<ScoringIntermediaireIndicator> list) {
        if ( list == null ) {
            return null;
        }

        List<ScoringIntermediaireIndicatorDTO> list1 = new ArrayList<ScoringIntermediaireIndicatorDTO>( list.size() );
        for ( ScoringIntermediaireIndicator scoringIntermediaireIndicator : list ) {
            list1.add( scoringIntermediaireIndicatorToScoringIntermediaireIndicatorDTO( scoringIntermediaireIndicator ) );
        }

        return list1;
    }

    protected ScoringEntete scoringEnteteDTOToScoringEntete(ScoringEnteteDTO scoringEnteteDTO) {
        if ( scoringEnteteDTO == null ) {
            return null;
        }

        ScoringEntete scoringEntete = new ScoringEntete();

        scoringEntete.setCreationPar( scoringEnteteDTO.getCreationPar() );
        scoringEntete.setDateCreation( scoringEnteteDTO.getDateCreation() );
        scoringEntete.setModifierPar( scoringEnteteDTO.getModifierPar() );
        scoringEntete.setDateModification( scoringEnteteDTO.getDateModification() );
        scoringEntete.setIdentifiant( scoringEnteteDTO.getIdentifiant() );
        scoringEntete.setDateDebut( scoringEnteteDTO.getDateDebut() );
        scoringEntete.setDateFin( scoringEnteteDTO.getDateFin() );
        scoringEntete.setStatus( scoringEnteteDTO.getStatus() );
        scoringEntete.setDateStatus( scoringEnteteDTO.getDateStatus() );
        scoringEntete.setTotalNumb( scoringEnteteDTO.getTotalNumb() );
        scoringEntete.setNumberTrapped( scoringEnteteDTO.getNumberTrapped() );
        scoringEntete.setDateProcessing( scoringEnteteDTO.getDateProcessing() );
        scoringEntete.setDateEndProcessing( scoringEnteteDTO.getDateEndProcessing() );
        scoringEntete.setCancels( scoringEnteteDTO.getCancels() );

        return scoringEntete;
    }

    protected Intermediaire intermediaireDTOToIntermediaire(IntermediaireDTO intermediaireDTO) {
        if ( intermediaireDTO == null ) {
            return null;
        }

        Intermediaire intermediaire = new Intermediaire();

        intermediaire.setCreationPar( intermediaireDTO.getCreationPar() );
        intermediaire.setDateCreation( intermediaireDTO.getDateCreation() );
        intermediaire.setModifierPar( intermediaireDTO.getModifierPar() );
        intermediaire.setDateModification( intermediaireDTO.getDateModification() );
        intermediaire.setIdentifiant( intermediaireDTO.getIdentifiant() );
        intermediaire.setCode( intermediaireDTO.getCode() );
        intermediaire.setQuallite( intermediaireDTO.getQuallite() );
        intermediaire.setFormejuridique( intermediaireDTO.getFormejuridique() );
        intermediaire.setMandante( intermediaireDTO.getMandante() );
        intermediaire.setDatedavenant( intermediaireDTO.getDatedavenant() );
        intermediaire.setNom( intermediaireDTO.getNom() );
        intermediaire.setLocalite( intermediaireDTO.getLocalite() );
        intermediaire.setAdresse( intermediaireDTO.getAdresse() );
        intermediaire.setLongitude( intermediaireDTO.getLongitude() );
        intermediaire.setLatitude( intermediaireDTO.getLatitude() );
        intermediaire.setDateagrement( intermediaireDTO.getDateagrement() );
        intermediaire.setTelephone( intermediaireDTO.getTelephone() );
        intermediaire.setTelephone2( intermediaireDTO.getTelephone2() );
        intermediaire.setFax( intermediaireDTO.getFax() );
        intermediaire.setEmail( intermediaireDTO.getEmail() );
        intermediaire.setCapitalsocial( intermediaireDTO.getCapitalsocial() );
        intermediaire.setNbrglobalpartsocial( intermediaireDTO.getNbrglobalpartsocial() );
        intermediaire.setNaturepolicerc( intermediaireDTO.getNaturepolicerc() );
        intermediaire.setAssureur( intermediaireDTO.getAssureur() );

        return intermediaire;
    }

    protected ScoringIntermediaireIndicator scoringIntermediaireIndicatorDTOToScoringIntermediaireIndicator(ScoringIntermediaireIndicatorDTO scoringIntermediaireIndicatorDTO) {
        if ( scoringIntermediaireIndicatorDTO == null ) {
            return null;
        }

        ScoringIntermediaireIndicator scoringIntermediaireIndicator = new ScoringIntermediaireIndicator();

        scoringIntermediaireIndicator.setCreationPar( scoringIntermediaireIndicatorDTO.getCreationPar() );
        scoringIntermediaireIndicator.setDateCreation( scoringIntermediaireIndicatorDTO.getDateCreation() );
        scoringIntermediaireIndicator.setModifierPar( scoringIntermediaireIndicatorDTO.getModifierPar() );
        scoringIntermediaireIndicator.setDateModification( scoringIntermediaireIndicatorDTO.getDateModification() );
        scoringIntermediaireIndicator.setIdentifiant( scoringIntermediaireIndicatorDTO.getIdentifiant() );
        scoringIntermediaireIndicator.setNote( scoringIntermediaireIndicatorDTO.getNote() );
        scoringIntermediaireIndicator.setStatut( scoringIntermediaireIndicatorDTO.getStatut() );
        scoringIntermediaireIndicator.setDatestatut( scoringIntermediaireIndicatorDTO.getDatestatut() );

        return scoringIntermediaireIndicator;
    }

    protected List<ScoringIntermediaireIndicator> scoringIntermediaireIndicatorDTOListToScoringIntermediaireIndicatorList(List<ScoringIntermediaireIndicatorDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ScoringIntermediaireIndicator> list1 = new ArrayList<ScoringIntermediaireIndicator>( list.size() );
        for ( ScoringIntermediaireIndicatorDTO scoringIntermediaireIndicatorDTO : list ) {
            list1.add( scoringIntermediaireIndicatorDTOToScoringIntermediaireIndicator( scoringIntermediaireIndicatorDTO ) );
        }

        return list1;
    }
}
