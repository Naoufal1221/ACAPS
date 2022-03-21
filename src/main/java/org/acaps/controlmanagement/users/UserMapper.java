package org.acaps.controlmanagement.users;

import org.acaps.controlmanagement.scoringentete.ScoringEntete;
import org.acaps.controlmanagement.scoringentete.ScoringEnteteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "scoringEntetesCancelBy", target = "scoringEntetesCancelByDTOS"),
            @Mapping(source = "scoringEntetesAssignBy", target = "scoringEnteteAssignByDTOS")
    })
    UserDTO toDTO(User user);

    @Mappings({
            @Mapping(source = "scoringEntetesCancelBy", target = "scoringEntetesCancelByDTOS"),
            @Mapping(source = "scoringEntetesAssignBy", target = "scoringEnteteAssignByDTOS")
    })
    List<UserDTO> toDTOs(List<User> users);
    @Mappings({
            @Mapping(source = "scoringEntetesCancelByDTOS", target = "scoringEntetesCancelBy"),
            @Mapping(source = "scoringEnteteAssignByDTOS", target = "scoringEntetesAssignBy")
    })
    User toEntity(UserDTO userDTO);

    @Mappings({
            @Mapping(source = "scoringEntetesCancelByDTOS", target = "scoringEntetesCancelBy"),
            @Mapping(source = "scoringEnteteAssignByDTOS", target = "scoringEntetesAssignBy")
    })
    List<User> toEntities(List<UserDTO> userDTOS);

}
