package com.kocsisrobert.cal.mapper;

import com.kocsisrobert.cal.domain.User;
import com.kocsisrobert.cal.dto.UserRegistrationData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    User userRegistrationDataToUser(UserRegistrationData userRegistrationData);
}