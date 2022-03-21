package org.acaps.controlmanagement.criteres;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CriteriaMapper {

    @Mappings({
            @Mapping(source = "indicator", target = "indicatorDTO"),
            @Mapping(source = "scoringIntermediaireIndicators", target = "scoringIntermediaireIndicatorDTOS")
    })

    CriteriaDTO toDTO(Criteria criteria);
   @Mappings({
           @Mapping(source = "indicator", target = "indicatorDTO"),
           @Mapping(source = "scoringIntermediaireIndicators", target = "scoringIntermediaireIndicatorDTOS")
   })

    List<CriteriaDTO> toDTOs(List<Criteria> criteriaList);

   @Mappings({
           @Mapping(source = "indicatorDTO", target = "indicator"),
           @Mapping(source = "scoringIntermediaireIndicatorDTOS", target = "scoringIntermediaireIndicators")
     })

    Criteria toEntity(CriteriaDTO criteriaDTO);

    @Mappings({
            @Mapping(source = "indicatorDTO", target = "indicator"),
            @Mapping(source = "scoringIntermediaireIndicatorDTOS", target = "scoringIntermediaireIndicators")
    })
    List<Criteria> toEntities(List<CriteriaDTO> criteriaDTOS);
}
