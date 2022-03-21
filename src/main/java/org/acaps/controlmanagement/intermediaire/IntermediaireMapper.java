package org.acaps.controlmanagement.intermediaire;



import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IntermediaireMapper {

    @Mapping(source = "scoringIntermediaires", target = "scoringIntermediaireDTOS")
    IntermediaireDTO toDTO(Intermediaire intermediaire);

    @Mapping(source = "scoringIntermediaires", target = "scoringIntermediaireDTOS")
    List<IntermediaireDTO> toDTOs(List<Intermediaire> intermediaireList);

    @Mapping(source = "scoringIntermediaireDTOS", target = "scoringIntermediaires")
    Intermediaire toEntity(IntermediaireDTO intermediaireDTO);

    @Mapping(source = "scoringIntermediaires", target = "scoringIntermediaireDTOS")
    List<Intermediaire> toEntities(List<IntermediaireDTO> intermediaireDTOS);

}
