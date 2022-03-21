package org.acaps.controlmanagement.intermediaire;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaireDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-18T16:59:23+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class IntermediaireMapperImpl implements IntermediaireMapper {

    @Override
    public IntermediaireDTO toDTO(Intermediaire intermediaire) {
        if ( intermediaire == null ) {
            return null;
        }

        IntermediaireDTO intermediaireDTO = new IntermediaireDTO();

        intermediaireDTO.setScoringIntermediaireDTOS( scoringIntermediaireListToScoringIntermediaireDTOList( intermediaire.getScoringIntermediaires() ) );
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

    @Override
    public List<IntermediaireDTO> toDTOs(List<Intermediaire> intermediaireList) {
        if ( intermediaireList == null ) {
            return null;
        }

        List<IntermediaireDTO> list = new ArrayList<IntermediaireDTO>( intermediaireList.size() );
        for ( Intermediaire intermediaire : intermediaireList ) {
            list.add( toDTO( intermediaire ) );
        }

        return list;
    }

    @Override
    public Intermediaire toEntity(IntermediaireDTO intermediaireDTO) {
        if ( intermediaireDTO == null ) {
            return null;
        }

        Intermediaire intermediaire = new Intermediaire();

        intermediaire.setScoringIntermediaires( scoringIntermediaireDTOListToScoringIntermediaireList( intermediaireDTO.getScoringIntermediaireDTOS() ) );
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

    @Override
    public List<Intermediaire> toEntities(List<IntermediaireDTO> intermediaireDTOS) {
        if ( intermediaireDTOS == null ) {
            return null;
        }

        List<Intermediaire> list = new ArrayList<Intermediaire>( intermediaireDTOS.size() );
        for ( IntermediaireDTO intermediaireDTO : intermediaireDTOS ) {
            list.add( toEntity( intermediaireDTO ) );
        }

        return list;
    }

    protected ScoringIntermediaireDTO scoringIntermediaireToScoringIntermediaireDTO(ScoringIntermediaire scoringIntermediaire) {
        if ( scoringIntermediaire == null ) {
            return null;
        }

        ScoringIntermediaireDTO scoringIntermediaireDTO = new ScoringIntermediaireDTO();

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

    protected List<ScoringIntermediaireDTO> scoringIntermediaireListToScoringIntermediaireDTOList(List<ScoringIntermediaire> list) {
        if ( list == null ) {
            return null;
        }

        List<ScoringIntermediaireDTO> list1 = new ArrayList<ScoringIntermediaireDTO>( list.size() );
        for ( ScoringIntermediaire scoringIntermediaire : list ) {
            list1.add( scoringIntermediaireToScoringIntermediaireDTO( scoringIntermediaire ) );
        }

        return list1;
    }

    protected ScoringIntermediaire scoringIntermediaireDTOToScoringIntermediaire(ScoringIntermediaireDTO scoringIntermediaireDTO) {
        if ( scoringIntermediaireDTO == null ) {
            return null;
        }

        ScoringIntermediaire scoringIntermediaire = new ScoringIntermediaire();

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

    protected List<ScoringIntermediaire> scoringIntermediaireDTOListToScoringIntermediaireList(List<ScoringIntermediaireDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ScoringIntermediaire> list1 = new ArrayList<ScoringIntermediaire>( list.size() );
        for ( ScoringIntermediaireDTO scoringIntermediaireDTO : list ) {
            list1.add( scoringIntermediaireDTOToScoringIntermediaire( scoringIntermediaireDTO ) );
        }

        return list1;
    }
}
