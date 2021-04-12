package com.challenge.globalSys.service.Impl;

import com.challenge.globalSys.dto.CepDTO;
import com.challenge.globalSys.entity.Cep;
import com.challenge.globalSys.mapper.ICepMapper;
import com.challenge.globalSys.repository.ICepRepository;
import com.challenge.globalSys.service.ICepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CepService implements ICepService {

    @Autowired
    ICepMapper mapper;

    @Autowired
    ICepRepository repository;

    @Override
    public CepDTO getByCep(Long cep) {
        return mapper.toDto(repository.getByCep(cep));
    }

    @Override
    public void create(CepDTO dto) {
        if (validationCep(dto))
            repository.save(mapper.toEntity(dto));
    }

    @Override
    public void update(CepDTO dto) {
        if (validationCep(dto))
            repository.save(mapper.toEntity(dto));
    }

    @Override
    public void delete(CepDTO dto) {
        repository.delete(mapper.toEntity(dto));
    }

    public Boolean validationCep(CepDTO dto) {
        List<Cep> list = repository.findAll();

        int checkStart = (int) list.stream()
                .filter(cep -> !cep.getId().equals(dto.getId())
                        && dto.getStartTrack() >= cep.getStartTrack()
                        && dto.getStartTrack() < cep.getEndTrack()).count();

        int checkEnd = (int) list.stream()
                .filter(cep -> !cep.getId().equals(dto.getId())
                        && dto.getEndTrack() >= cep.getStartTrack()
                        && dto.getEndTrack() < cep.getEndTrack()).count();

        return checkStart == 0 && checkEnd == 0;
    }

}
