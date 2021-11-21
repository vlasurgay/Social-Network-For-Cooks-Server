package com.edu.netc.bakensweets.mapperConfig;

import com.edu.netc.bakensweets.dto.UpdateAccountDTO;
import com.edu.netc.bakensweets.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface UpdateAccountMapper {
    @Mappings({
            @Mapping(target="firstName", source="dto.firstName"),
            @Mapping(target="lastName", source="dto.lastName"),
            @Mapping(target = "birthDate", source = "dto.birthDate"),
            @Mapping(target = "gender", source = "dto.gender")
    })
    Account updateAccountDTOtoAccounts(UpdateAccountDTO dto);
}
