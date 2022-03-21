package org.acaps.controlmanagement.indicateur;

import lombok.RequiredArgsConstructor;
import org.acaps.controlmanagement.indicateur.dtos.IndicatorDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@RequiredArgsConstructor
public class IndicatorService {

    private final IndicatorDAO indicatorDAO;
     private final IndicatorMapper indicatorMapper;

   /* public Page<IndicatorDTO> getAllIndicator(int page, int size){
        return (Page<IndicatorDTO>) this.indicatorDAO.findAll(PageRequest.of(page,size)).stream()
                .map(indicatorMapper::toDTO).collect(Collectors.toList());

    }*/
    public List<IndicatorDTO> getAllIndicator(){
        return  this.indicatorDAO.findAll().stream()
                .map(indicatorMapper::toDTO).collect(Collectors.toList());

    }





    public IndicatorDTO createIndicator(IndicatorDTO indicatorDTO ){
        Indicator indicator = this.indicatorMapper.toEntity(indicatorDTO);
        return this.indicatorMapper.toDTO(this.indicatorDAO.save(indicator));
    }


   public Indicator update(Long identifiant,Indicator indicator){
  Indicator updateIndicator = this.indicatorDAO.findIndicatorByIdentifiant(identifiant);
      if (updateIndicator == null) return null;
      updateIndicator.setLibelle(indicator.getLibelle());
      updateIndicator.setDescription(indicator.getDescription());
      updateIndicator.setPonderation(indicator.getPonderation());
      updateIndicator.setActif(indicator.getActif());
      updateIndicator.setDateDebut(indicator.getDateDebut());
      updateIndicator.setDateFin(indicator.getDateFin());
      updateIndicator.setTraitement(indicator.getTraitement());
      updateIndicator.setFlagBgd(indicator.getFlagBgd());
      return this.indicatorDAO.save(updateIndicator);
   }

   public IndicatorDTO changeIndicatorStatus(Long identifiant,IndicatorDTO indicatorDTO){
       Indicator updateIndicator = this.indicatorDAO.findIndicatorByIdentifiant(identifiant);
       if (updateIndicator == null) return null;
       updateIndicator.setLibelle(indicatorDTO.getLibelle());
       updateIndicator.setDescription(indicatorDTO.getDescription());
       updateIndicator.setPonderation(indicatorDTO.getPonderation());
       updateIndicator.setActif(indicatorDTO.getActif());
       updateIndicator.setDateDebut(indicatorDTO.getDateDebut());
       if (indicatorDTO.getActif().equalsIgnoreCase("N")){
           updateIndicator.setDateFin(new Date());
       }
       else {
           updateIndicator.setDateFin(null);
       }
       updateIndicator.setTraitement(indicatorDTO.getTraitement());
       updateIndicator.setFlagBgd(indicatorDTO.getFlagBgd());
       return this.indicatorMapper.toDTO(this.indicatorDAO.save(updateIndicator));

   }

}
