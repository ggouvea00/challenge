package com.challenge.globalSys.service;

import com.challenge.globalSys.dto.CepDTO;

public interface ICepService {

    CepDTO getByCep(Long cep);

    void create(CepDTO dto);

    void delete(CepDTO dto);

    void update(CepDTO dto);
}
