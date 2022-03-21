package org.acaps.controlmanagement.scoringentete;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScoringEnteteMapper {

  @Mappings({
          @Mapping(source = "scoringIntermediaires", target = "scoringIntermediaireDTOS"),
          @Mapping(source = "userCancelBy", target = "userCancelByDTO"),
          @Mapping(source = "userAssignBy", target = "userAssignByDTO")
  })
    ScoringEnteteDTO toDTO(ScoringEntete scoringEntete);

    @Mappings({
            @Mapping(source = "scoringIntermediaires", target = "scoringIntermediaireDTOS"),
            @Mapping(source = "userCancelBy", target = "userCancelByDTO"),
            @Mapping(source = "userAssignBy", target = "userAssignByDTO")
    })
    List<ScoringEnteteDTO> toDTOs(List<ScoringEntete> scoringEntetes);
    @Mappings({
            @Mapping(source = "scoringIntermediaireDTOS", target = "scoringIntermediaires"),
            @Mapping(source = "userCancelByDTO", target = "userCancelBy"),
            @Mapping(source = "userAssignByDTO", target = "userAssignBy")
    })
    ScoringEntete toEntity(ScoringEnteteDTO scoringEnteteDTO);

    @Mappings({
            @Mapping(source = "scoringIntermediaireDTOS", target = "scoringIntermediaires"),
            @Mapping(source = "userCancelByDTO", target = "userCancelBy"),
            @Mapping(source = "userAssignByDTO", target = "userAssignBy")
    })
    List<ScoringEntete> toEntities(List<ScoringEnteteDTO> scoringEnteteDTOS);





}
