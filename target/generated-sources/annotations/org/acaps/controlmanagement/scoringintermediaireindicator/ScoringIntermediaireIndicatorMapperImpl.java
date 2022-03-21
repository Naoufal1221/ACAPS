package org.acaps.controlmanagement.scoringintermediaireindicator;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.acaps.controlmanagement.criteres.Criteria;
import org.acaps.controlmanagement.criteres.CriteriaDTO;
import org.acaps.controlmanagement.indicateur.Indicator;
import org.acaps.controlmanagement.indicateur.dtos.IndicatorDTO;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaire;
import org.acaps.controlmanagement.scoringintermediiare.ScoringIntermediaireDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-18T16:59:24+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class ScoringIntermediaireIndicatorMapperImpl implements ScoringIntermediaireIndicatorMapper {

    @Override
    public ScoringIntermediaireIndicatorDTO toDTO(ScoringIntermediaireIndicator scoringIntermediaireIndicator) {
        if ( scoringIntermediaireIndicator == null ) {
            return null;
        }

        ScoringIntermediaireIndicatorDTO scoringIntermediaireIndicatorDTO = new ScoringIntermediaireIndicatorDTO();

        scoringIntermediaireIndicatorDTO.setScoringIntermediaireDTO( scoringIntermediaireToScoringIntermediaireDTO( scoringIntermediaireIndicator.getScoringIntermediaire() ) );
        scoringIntermediaireIndicatorDTO.setIndicatorDTO( indicatorToIndicatorDTO( scoringIntermediaireIndicator.getIndicator() ) );
        scoringIntermediaireIndicatorDTO.setCriteriaDTO( criteriaToCriteriaDTO( scoringIntermediaireIndicator.getCriteria() ) );
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

    @Override
    public List<ScoringIntermediaireIndicatorDTO> toDTOs(List<ScoringIntermediaireIndicator> scoringIntermediaireIndicators) {
        if ( scoringIntermediaireIndicators == null ) {
            return null;
        }

        List<ScoringIntermediaireIndicatorDTO> list = new ArrayList<ScoringIntermediaireIndicatorDTO>( scoringIntermediaireIndicators.size() );
        for ( ScoringIntermediaireIndicator scoringIntermediaireIndicator : scoringIntermediaireIndicators ) {
            list.add( toDTO( scoringIntermediaireIndicator ) );
        }

        return list;
    }

    @Override
    public ScoringIntermediaireIndicator toEntity(ScoringIntermediaireIndicatorDTO scoringEnteteDTO) {
        if ( scoringEnteteDTO == null ) {
            return null;
        }

        ScoringIntermediaireIndicator scoringIntermediaireIndicator = new ScoringIntermediaireIndicator();

        scoringIntermediaireIndicator.setScoringIntermediaire( scoringIntermediaireDTOToScoringIntermediaire( scoringEnteteDTO.getScoringIntermediaireDTO() ) );
        scoringIntermediaireIndicator.setIndicator( indicatorDTOToIndicator( scoringEnteteDTO.getIndicatorDTO() ) );
        scoringIntermediaireIndicator.setCriteria( criteriaDTOToCriteria( scoringEnteteDTO.getCriteriaDTO() ) );
        scoringIntermediaireIndicator.setCreationPar( scoringEnteteDTO.getCreationPar() );
        scoringIntermediaireIndicator.setDateCreation( scoringEnteteDTO.getDateCreation() );
        scoringIntermediaireIndicator.setModifierPar( scoringEnteteDTO.getModifierPar() );
        scoringIntermediaireIndicator.setDateModification( scoringEnteteDTO.getDateModification() );
        scoringIntermediaireIndicator.setIdentifiant( scoringEnteteDTO.getIdentifiant() );
        scoringIntermediaireIndicator.setNote( scoringEnteteDTO.getNote() );
        scoringIntermediaireIndicator.setStatut( scoringEnteteDTO.getStatut() );
        scoringIntermediaireIndicator.setDatestatut( scoringEnteteDTO.getDatestatut() );

        return scoringIntermediaireIndicator;
    }

    @Override
    public List<ScoringIntermediaireIndicator> toEntities(List<ScoringIntermediaireIndicatorDTO> scoringEnteteDTOS) {
        if ( scoringEnteteDTOS == null ) {
            return null;
        }

        List<ScoringIntermediaireIndicator> list = new ArrayList<ScoringIntermediaireIndicator>( scoringEnteteDTOS.size() );
        for ( ScoringIntermediaireIndicatorDTO scoringIntermediaireIndicatorDTO : scoringEnteteDTOS ) {
            list.add( toEntity( scoringIntermediaireIndicatorDTO ) );
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

    protected IndicatorDTO indicatorToIndicatorDTO(Indicator indicator) {
        if ( indicator == null ) {
            return null;
        }

        IndicatorDTO indicatorDTO = new IndicatorDTO();

        indicatorDTO.setCreationPar( indicator.getCreationPar() );
        indicatorDTO.setDateCreation( indicator.getDateCreation() );
        indicatorDTO.setModifierPar( indicator.getModifierPar() );
        indicatorDTO.setDateModification( indicator.getDateModification() );
        indicatorDTO.setIdentifiant( indicator.getIdentifiant() );
        indicatorDTO.setLibelle( indicator.getLibelle() );
        indicatorDTO.setDescription( indicator.getDescription() );
        indicatorDTO.setPonderation( indicator.getPonderation() );
        indicatorDTO.setActif( indicator.getActif() );
        indicatorDTO.setDateDebut( indicator.getDateDebut() );
        indicatorDTO.setDateFin( indicator.getDateFin() );
        indicatorDTO.setTraitement( indicator.getTraitement() );
        indicatorDTO.setFlagBgd( indicator.getFlagBgd() );

        return indicatorDTO;
    }

    protected CriteriaDTO criteriaToCriteriaDTO(Criteria criteria) {
        if ( criteria == null ) {
            return null;
        }

        CriteriaDTO criteriaDTO = new CriteriaDTO();

        criteriaDTO.setCreationPar( criteria.getCreationPar() );
        criteriaDTO.setDateCreation( criteria.getDateCreation() );
        criteriaDTO.setModifierPar( criteria.getModifierPar() );
        criteriaDTO.setDateModification( criteria.getDateModification() );
        criteriaDTO.setIdentifiant( criteria.getIdentifiant() );
        criteriaDTO.setLibelle( criteria.getLibelle() );
        criteriaDTO.setDescription( criteria.getDescription() );
        criteriaDTO.setNote( criteria.getNote() );
        criteriaDTO.setValeurMin( criteria.getValeurMin() );
        criteriaDTO.setValeurMax( criteria.getValeurMax() );
        criteriaDTO.setActif( criteria.getActif() );
        criteriaDTO.setDateDebut( criteria.getDateDebut() );
        criteriaDTO.setDateFin( criteria.getDateFin() );

        return criteriaDTO;
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

    protected Indicator indicatorDTOToIndicator(IndicatorDTO indicatorDTO) {
        if ( indicatorDTO == null ) {
            return null;
        }

        Indicator indicator = new Indicator();

        indicator.setCreationPar( indicatorDTO.getCreationPar() );
        indicator.setDateCreation( indicatorDTO.getDateCreation() );
        indicator.setModifierPar( indicatorDTO.getModifierPar() );
        indicator.setDateModification( indicatorDTO.getDateModification() );
        indicator.setIdentifiant( indicatorDTO.getIdentifiant() );
        indicator.setLibelle( indicatorDTO.getLibelle() );
        indicator.setDescription( indicatorDTO.getDescription() );
        indicator.setPonderation( indicatorDTO.getPonderation() );
        indicator.setActif( indicatorDTO.getActif() );
        indicator.setDateDebut( indicatorDTO.getDateDebut() );
        indicator.setDateFin( indicatorDTO.getDateFin() );
        indicator.setTraitement( indicatorDTO.getTraitement() );
        indicator.setFlagBgd( indicatorDTO.getFlagBgd() );

        return indicator;
    }

    protected Criteria criteriaDTOToCriteria(CriteriaDTO criteriaDTO) {
        if ( criteriaDTO == null ) {
            return null;
        }

        Criteria criteria = new Criteria();

        criteria.setCreationPar( criteriaDTO.getCreationPar() );
        criteria.setDateCreation( criteriaDTO.getDateCreation() );
        criteria.setModifierPar( criteriaDTO.getModifierPar() );
        criteria.setDateModification( criteriaDTO.getDateModification() );
        criteria.setIdentifiant( criteriaDTO.getIdentifiant() );
        criteria.setLibelle( criteriaDTO.getLibelle() );
        criteria.setDescription( criteriaDTO.getDescription() );
        criteria.setNote( criteriaDTO.getNote() );
        criteria.setValeurMin( criteriaDTO.getValeurMin() );
        criteria.setValeurMax( criteriaDTO.getValeurMax() );
        criteria.setActif( criteriaDTO.getActif() );
        criteria.setDateDebut( criteriaDTO.getDateDebut() );
        criteria.setDateFin( criteriaDTO.getDateFin() );

        return criteria;
    }
}
