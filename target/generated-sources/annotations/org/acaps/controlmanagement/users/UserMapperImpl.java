package org.acaps.controlmanagement.users;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringentete.ScoringEnteteDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-18T16:59:24+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setScoringEntetesCancelByDTOS( scoringEnteteListToScoringEnteteDTOList( user.getScoringEntetesCancelBy() ) );
        userDTO.setScoringEnteteAssignByDTOS( scoringEnteteListToScoringEnteteDTOList( user.getScoringEntetesAssignBy() ) );
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

    @Override
    public List<UserDTO> toDTOs(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setScoringEntetesCancelBy( scoringEnteteDTOListToScoringEnteteList( userDTO.getScoringEntetesCancelByDTOS() ) );
        user.setScoringEntetesAssignBy( scoringEnteteDTOListToScoringEnteteList( userDTO.getScoringEnteteAssignByDTOS() ) );
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

    @Override
    public List<User> toEntities(List<UserDTO> userDTOS) {
        if ( userDTOS == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDTOS.size() );
        for ( UserDTO userDTO : userDTOS ) {
            list.add( toEntity( userDTO ) );
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

    protected List<ScoringEnteteDTO> scoringEnteteListToScoringEnteteDTOList(List<ScoringEntete> list) {
        if ( list == null ) {
            return null;
        }

        List<ScoringEnteteDTO> list1 = new ArrayList<ScoringEnteteDTO>( list.size() );
        for ( ScoringEntete scoringEntete : list ) {
            list1.add( scoringEnteteToScoringEnteteDTO( scoringEntete ) );
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

    protected List<ScoringEntete> scoringEnteteDTOListToScoringEnteteList(List<ScoringEnteteDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ScoringEntete> list1 = new ArrayList<ScoringEntete>( list.size() );
        for ( ScoringEnteteDTO scoringEnteteDTO : list ) {
            list1.add( scoringEnteteDTOToScoringEntete( scoringEnteteDTO ) );
        }

        return list1;
    }
}
