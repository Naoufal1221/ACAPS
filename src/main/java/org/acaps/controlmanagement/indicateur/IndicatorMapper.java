package org.acaps.controlmanagement.indicateur;


import org.acaps.controlmanagement.indicateur.dtos.IndicatorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IndicatorMapper {


   @Mappings({
           @Mapping(source = "criteriaList", target = "criterias"),
           @Mapping(source = "scoringIntermediaireIndicatorsList", target = "scoringIntermediaireIndicators")
   })
   IndicatorDTO toDTO(Indicator indicator);
    @Mappings({
            @Mapping(source = "criterias", target = "criteriaList"),
            @Mapping(source = "scoringIntermediaireIndicators", target = "scoringIntermediaireIndicatorsList")
    })
    Indicator toEntity(IndicatorDTO indicatorDTO);


}
