package org.acaps.controlmanagement.scoringentete;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaireDTO;
import org.acaps.controlmanagement.users.User;
import org.acaps.controlmanagement.users.UserDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-18T16:59:24+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class ScoringEnteteMapperImpl implements ScoringEnteteMapper {

    @Override
    public ScoringEnteteDTO toDTO(ScoringEntete scoringEntete) {
        if ( scoringEntete == null ) {
            return null;
        }

        ScoringEnteteDTO scoringEnteteDTO = new ScoringEnteteDTO();

        scoringEnteteDTO.setScoringIntermediaireDTOS( scoringIntermediaireListToScoringIntermediaireDTOList( scoringEntete.getScoringIntermediaires() ) );
        scoringEnteteDTO.setUserCancelByDTO( userToUserDTO( scoringEntete.getUserCancelBy() ) );
        scoringEnteteDTO.setUserAssignByDTO( userToUserDTO( scoringEntete.getUserAssignBy() ) );
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

    @Override
    public List<ScoringEnteteDTO> toDTOs(List<ScoringEntete> scoringEntetes) {
        if ( scoringEntetes == null ) {
            return null;
        }

        List<ScoringEnteteDTO> list = new ArrayList<ScoringEnteteDTO>( scoringEntetes.size() );
        for ( ScoringEntete scoringEntete : scoringEntetes ) {
            list.add( toDTO( scoringEntete ) );
        }

        return list;
    }

    @Override
    public ScoringEntete toEntity(ScoringEnteteDTO scoringEnteteDTO) {
        if ( scoringEnteteDTO == null ) {
            return null;
        }

        ScoringEntete scoringEntete = new ScoringEntete();

        scoringEntete.setScoringIntermediaires( scoringIntermediaireDTOListToScoringIntermediaireList( scoringEnteteDTO.getScoringIntermediaireDTOS() ) );
        scoringEntete.setUserCancelBy( userDTOToUser( scoringEnteteDTO.getUserCancelByDTO() ) );
        scoringEntete.setUserAssignBy( userDTOToUser( scoringEnteteDTO.getUserAssignByDTO() ) );
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

    @Override
    public List<ScoringEntete> toEntities(List<ScoringEnteteDTO> scoringEnteteDTOS) {
        if ( scoringEnteteDTOS == null ) {
            return null;
        }

        List<ScoringEntete> list = new ArrayList<ScoringEntete>( scoringEnteteDTOS.size() );
        for ( ScoringEnteteDTO scoringEnteteDTO : scoringEnteteDTOS ) {
            list.add( toEntity( scoringEnteteDTO ) );
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

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setIdentifiant( user.getIdentifiant() );
        userDTO.setNom( user.getNom() );
        userDTO.setPrenom( user.getPrenom() );
        userDTO.setLogin( user.getLogin() );
        userDTO.setMotdepasse( user.getMotdepasse() );
        userDTO.setTypeUtilisateur( user.getTypeUtilisateur() );
        userDTO.setEntite( user.getEntite() );
        userDTO.setIntermediaire( user.getIntermediaire() );
        userDTO.setEmploi( user.getEmploi() );
        userDTO.setStatut( user.getStatut() );
        userDTO.setMotdepasseexpire( user.getMotdepasseexpire() );
        userDTO.setResponsable( user.getResponsable() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setActive( user.isActive() );
        userDTO.setNotLocked( user.isNotLocked() );

        return userDTO;
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

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setIdentifiant( userDTO.getIdentifiant() );
        user.setNom( userDTO.getNom() );
        user.setPrenom( userDTO.getPrenom() );
        user.setLogin( userDTO.getLogin() );
        user.setMotdepasse( userDTO.getMotdepasse() );
        user.setTypeUtilisateur( userDTO.getTypeUtilisateur() );
        user.setEntite( userDTO.getEntite() );
        user.setIntermediaire( userDTO.getIntermediaire() );
        user.setEmploi( userDTO.getEmploi() );
        user.setStatut( userDTO.getStatut() );
        user.setMotdepasseexpire( userDTO.getMotdepasseexpire() );
        user.setResponsable( userDTO.getResponsable() );
        user.setEmail( userDTO.getEmail() );
        user.setActive( userDTO.isActive() );
        user.setNotLocked( userDTO.isNotLocked() );

        return user;
    }
}
