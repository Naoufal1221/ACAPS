package org.acaps.controlmanagement.scoringintermediaireindicator;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScoringIntermediaireIndicatorMapper {

    @Mappings({
            @Mapping(source = "scoringIntermediaire", target = "scoringIntermediaireDTO"),
            @Mapping(source = "indicator", target = "indicatorDTO"),
            @Mapping(source = "criteria", target = "criteriaDTO")
    })
    ScoringIntermediaireIndicatorDTO toDTO(ScoringIntermediaireIndicator scoringIntermediaireIndicator);

    @Mappings({
            @Mapping(source = "scoringIntermediaire", target = "scoringIntermediaireDTO"),
            @Mapping(source = "indicator", target = "indicatorDTO"),
            @Mapping(source = "criteria", target = "criteriaDTO")
    })
    List<ScoringIntermediaireIndicatorDTO> toDTOs(List<ScoringIntermediaireIndicator> scoringIntermediaireIndicators);
    @Mappings({
            @Mapping(source = "scoringIntermediaireDTO", target = "scoringIntermediaire"),
            @Mapping(source = "indicatorDTO", target = "indicator"),
            @Mapping(source = "criteriaDTO", target = "criteria")
    })
    ScoringIntermediaireIndicator toEntity(ScoringIntermediaireIndicatorDTO scoringEnteteDTO);

    @Mappings({
            @Mapping(source = "scoringIntermediaireDTO", target = "scoringIntermediaire"),
            @Mapping(source = "indicatorDTO", target = "indicator"),
            @Mapping(source = "criteriaDTO", target = "criteria")
    })
    List<ScoringIntermediaireIndicator> toEntities(List<ScoringIntermediaireIndicatorDTO> scoringEnteteDTOS);
}
