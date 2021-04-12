package com.challenge.globalSys.controller;


import com.challenge.globalSys.dto.CepDTO;
import com.challenge.globalSys.service.ICepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/store")
public class CepController {

    @Autowired
    ICepService service;

    @GetMapping(path = "/cep/{cep}")
    public ResponseEntity<CepDTO> getByCep(@PathVariable Long cep) {
        return new ResponseEntity<>(service.getByCep(cep), HttpStatus.OK);
    }

    @PostMapping(path = "/cep")
    public ResponseEntity<?> create(@RequestBody @Valid CepDTO dto) {
        service.create(dto);
        return new ResponseEntity<>("Cep successfully created\n" + dto.toString(), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/cep")
    public ResponseEntity<?> delete(@RequestBody @Valid CepDTO dto) {
        service.delete(dto);
        return new ResponseEntity<>("Cep successfully deleted", HttpStatus.OK);
    }

    @PutMapping(path = "/cep")
    public ResponseEntity<?> update(@RequestBody @Valid CepDTO dto) {
        service.update(dto);
        return new ResponseEntity<>("Cep changed successfully", HttpStatus.OK);
    }



}
