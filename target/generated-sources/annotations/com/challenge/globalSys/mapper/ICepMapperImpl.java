package com.challenge.globalSys.mapper;

import com.challenge.globalSys.dto.CepDTO;
import com.challenge.globalSys.entity.Cep;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-12T16:17:35-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.9 (Azul Systems, Inc.)"
)
@Component
public class ICepMapperImpl implements ICepMapper {

    @Override
    public CepDTO toDto(Cep cep) {
        if ( cep == null ) {
            return null;
        }

        CepDTO cepDTO = new CepDTO();

        cepDTO.setId( cep.getId() );
        cepDTO.setStoreCode( cep.getStoreCode() );
        cepDTO.setStartTrack( cep.getStartTrack() );
        cepDTO.setEndTrack( cep.getEndTrack() );

        return cepDTO;
    }

    @Override
    public Cep toEntity(CepDTO cep) {
        if ( cep == null ) {
            return null;
        }

        Cep cep1 = new Cep();

        cep1.setId( cep.getId() );
        cep1.setStoreCode( cep.getStoreCode() );
        cep1.setStartTrack( cep.getStartTrack() );
        cep1.setEndTrack( cep.getEndTrack() );

        return cep1;
    }
}
