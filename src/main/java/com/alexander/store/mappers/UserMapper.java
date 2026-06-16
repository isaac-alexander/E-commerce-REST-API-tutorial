package com.alexander.store.mappers;

import com.alexander.store.dtos.RegisterUserRequest;
import com.alexander.store.dtos.UpdateUserRequest;
import com.alexander.store.dtos.UserDto;
import com.alexander.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

// spring creates beans of this type at runtime
@Mapper(componentModel = "spring")
public interface UserMapper {
//    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);

    User toEntity(RegisterUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
