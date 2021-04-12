package com.challenge.globalSys.mapper;

import com.challenge.globalSys.dto.CepDTO;
import com.challenge.globalSys.entity.Cep;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICepMapper {

    CepDTO toDto(Cep cep);

    Cep toEntity(CepDTO cep);
}
