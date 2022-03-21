package org.acaps.controlmanagement.criteres;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.acaps.controlmanagement.indicateur.Indicator;
import org.acaps.controlmanagement.indicateur.dtos.IndicatorDTO;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicator;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicatorDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-21T11:12:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class CriteriaMapperImpl implements CriteriaMapper {

    @Override
    public CriteriaDTO toDTO(Criteria criteria) {
        if ( criteria == null ) {
            return null;
        }

        CriteriaDTO criteriaDTO = new CriteriaDTO();

        criteriaDTO.setIndicatorDTO( indicatorToIndicatorDTO( criteria.getIndicator() ) );
        criteriaDTO.setScoringIntermediaireIndicatorDTOS( scoringIntermediaireIndicatorListToScoringIntermediaireIndicatorDTOList( criteria.getScoringIntermediaireIndicators() ) );
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

    @Override
    public List<CriteriaDTO> toDTOs(List<Criteria> criteriaList) {
        if ( criteriaList == null ) {
            return null;
        }

        List<CriteriaDTO> list = new ArrayList<CriteriaDTO>( criteriaList.size() );
        for ( Criteria criteria : criteriaList ) {
            list.add( toDTO( criteria ) );
        }

        return list;
    }

    @Override
    public Criteria toEntity(CriteriaDTO criteriaDTO) {
        if ( criteriaDTO == null ) {
            return null;
        }

        Criteria criteria = new Criteria();

        criteria.setIndicator( indicatorDTOToIndicator( criteriaDTO.getIndicatorDTO() ) );
        criteria.setScoringIntermediaireIndicators( scoringIntermediaireIndicatorDTOListToScoringIntermediaireIndicatorList( criteriaDTO.getScoringIntermediaireIndicatorDTOS() ) );
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

    @Override
    public List<Criteria> toEntities(List<CriteriaDTO> criteriaDTOS) {
        if ( criteriaDTOS == null ) {
            return null;
        }

        List<Criteria> list = new ArrayList<Criteria>( criteriaDTOS.size() );
        for ( CriteriaDTO criteriaDTO : criteriaDTOS ) {
            list.add( toEntity( criteriaDTO ) );
        }

        return list;
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
