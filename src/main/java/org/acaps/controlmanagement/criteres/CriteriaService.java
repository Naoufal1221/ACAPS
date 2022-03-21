package org.acaps.controlmanagement.criteres;

import lombok.RequiredArgsConstructor;
import org.acaps.controlmanagement.exception.ItemNotFoundException;
import org.acaps.controlmanagement.indicateur.Indicator;
import org.acaps.controlmanagement.indicateur.IndicatorDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class CriteriaService {

    private final CriteriaDAO criteriaDAO;
    private final CriteriaMapper criteriaMapper;
    private final IndicatorDAO indicatorDAO;

    @Value("${maxvalueShouldBeGreaterThanMinvalueMsgVar}")
    private String maxvalueShouldBeGreaterThanMinvalueMsgVar;
    @Value("${endDateShouldBeGreaterThanStartDateMsgVar}")
    private String endDateShouldBeGreaterThanStartDateMsgVar;

    public List<CriteriaDTO> getAllCriteria(){
        return this.criteriaMapper.toDTOs(this.criteriaDAO.findAll(Sort.by("createdDate").descending())) ;
    }
    public List<CriteriaDTO> findActiveCriteriaByIndicator(Long indicatorID){
        return this.criteriaMapper.toDTOs(this.criteriaDAO.findActiveCriteriaByIndicator(indicatorID)) ;
    }

    public CriteriaDTO createCriteria(Long identifiant,CriteriaDTO criteriaDTO) throws ItemNotFoundException {
        Indicator indicator =this.indicatorDAO.findIndicatorByIdentifiant(identifiant);
        if (indicator== null){
            throw new ItemNotFoundException("Indicator not found by id : "+identifiant);
        }
        if (criteriaDTO.getValeurMax() < criteriaDTO.getValeurMin() ){
            throw new ItemNotFoundException("Valeur max doit  étre Supérieur de valeur min");
        }
        Criteria criteria = this.criteriaMapper.toEntity(criteriaDTO);
        criteria.setIndicator(indicator);
        return this.criteriaMapper.toDTO(this.criteriaDAO.save(criteria));


    }

    public CriteriaDTO updateCriteria(Long identifiantCriteria, Long identifiantIndicator, CriteriaDTO criteriaDTO) throws ItemNotFoundException {
        Criteria criteria =this.criteriaDAO.findCriteriaByIdentifiant(identifiantCriteria);
        if (criteria== null){
            throw new ItemNotFoundException("Criteria not found by id : "+identifiantCriteria);
        }
        if (criteriaDTO.getValeurMax() < criteriaDTO.getValeurMin() ){
            throw new ItemNotFoundException(maxvalueShouldBeGreaterThanMinvalueMsgVar);
        }
        // M1
        /*if (criteriaDTO.getDateFin().getTime() < criteriaDTO.getDateDebut().getTime() ){
            throw new ItemNotFoundException("Valeur max doit  étre Supérieur de valeur min");
        }*/
        // M2
        if (criteriaDTO.getDateFin() != null && criteriaDTO.getDateDebut() != null ){
            if (criteriaDTO.getDateDebut().compareTo(criteriaDTO.getDateFin()) > 0 ){
                throw new ItemNotFoundException(endDateShouldBeGreaterThanStartDateMsgVar);
            }
        }

        Indicator indicator =this.indicatorDAO.findIndicatorByIdentifiant(identifiantIndicator);
        if (indicator== null){
            throw new ItemNotFoundException("Indicator not found by id : "+identifiantIndicator);
        }
        criteria.setIndicator(indicator);
        criteria.setActif(criteriaDTO.getActif());
        criteria.setDateDebut(criteriaDTO.getDateDebut());
        criteria.setDateFin(criteriaDTO.getDateFin());
        criteria.setLibelle(criteriaDTO.getLibelle());
        criteria.setDescription(criteriaDTO.getDescription());
        criteria.setNote(criteriaDTO.getNote());
        criteria.setValeurMax(criteriaDTO.getValeurMax());
        criteria.setValeurMin(criteriaDTO.getValeurMin());
        return this.criteriaMapper.toDTO(this.criteriaDAO.save(criteria));
    }

      public CriteriaDTO changeCriteriaStatus(Long identifiantCriteria, Long identifiantIndicator, CriteriaDTO criteriaDTO) throws ItemNotFoundException {
            Criteria criteria =this.criteriaDAO.findCriteriaByIdentifiant(identifiantCriteria);
            if (criteria== null){
                throw new ItemNotFoundException("Criteria not found by id : "+identifiantCriteria);
            }
            if (criteriaDTO.getValeurMax() < criteriaDTO.getValeurMin() ){
                throw new ItemNotFoundException("Valeur max doit  étre Supérieur de valeur min");
            }
            // M1
            if (criteriaDTO.getDateFin().getTime() < criteriaDTO.getDateDebut().getTime() ){
                throw new ItemNotFoundException("Valeur max doit  étre Supérieur de valeur min");
            }
            // M2
            if (criteriaDTO.getDateDebut().compareTo(criteriaDTO.getDateFin()) > 0 ){
                throw new ItemNotFoundException("Valeur max doit  étre Supérieur de valeur min");
            }
           Indicator indicator =this.indicatorDAO.findIndicatorByIdentifiant(identifiantIndicator);
            if (indicator== null){
                throw new ItemNotFoundException("Indicator not found by id : "+identifiantIndicator);
            }
            criteria.setIndicator(indicator);
            criteria.setActif(criteriaDTO.getActif());
            criteria.setDateDebut(criteriaDTO.getDateDebut());
            criteria.setDateFin(new Date());
            criteria.setLibelle(criteriaDTO.getLibelle());
           criteria.setDescription(criteriaDTO.getDescription());
           criteria.setNote(criteriaDTO.getNote());
           criteria.setValeurMax(criteriaDTO.getValeurMax());
            criteria.setValeurMin(criteriaDTO.getValeurMin());
            return this.criteriaMapper.toDTO(this.criteriaDAO.save(criteria));
}
}
