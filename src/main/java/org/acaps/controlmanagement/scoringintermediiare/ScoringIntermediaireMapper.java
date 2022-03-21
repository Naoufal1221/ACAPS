package org.acaps.controlmanagement.scoringintermediiare;

import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicator;
import org.acaps.controlmanagement.scoringintermediaireindicator.ScoringIntermediaireIndicatorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScoringIntermediaireMapper {

    @Mappings({
            @Mapping(source = "scoringEntete", target = "scoringEnteteDTO"),
            @Mapping(source = "intermediaire", target = "intermediaireDTO"),
            @Mapping(source = "scoringIntermediaireIndicators", target = "scoringIntermediaireIndicatorDTOS")
    })
    ScoringIntermediaireDTO toDTO(ScoringIntermediaire scoringIntermediaire);

    @Mappings({
            @Mapping(source = "scoringEntete", target = "scoringEnteteDTO"),
            @Mapping(source = "intermediaire", target = "intermediaireDTO"),
            @Mapping(source = "scoringIntermediaireIndicators", target = "scoringIntermediaireIndicatorDTOS")
    })
    List<ScoringIntermediaireDTO> toDTOs(List<ScoringIntermediaire> scoringIntermediaires);
    @Mappings({
            @Mapping(source = "scoringEnteteDTO", target = "scoringEntete"),
            @Mapping(source = "intermediaireDTO", target = "intermediaire"),
            @Mapping(source = "scoringIntermediaireIndicatorDTOS", target = "scoringIntermediaireIndicators")
    })
    ScoringIntermediaire toEntity(ScoringIntermediaireDTO scoringIntermediaireDTO);

    @Mappings({
            @Mapping(source = "scoringEnteteDTO", target = "scoringEntete"),
            @Mapping(source = "intermediaireDTO", target = "intermediaire"),
            @Mapping(source = "scoringIntermediaireIndicatorDTOS", target = "scoringIntermediaireIndicators")
    })
    List<ScoringIntermediaire> toEntities(List<ScoringIntermediaireDTO> scoringIntermediaireDTOS);

}
