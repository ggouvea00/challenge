package com.challenge.globalSys.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class CepDTO implements Serializable {

    private UUID id;

    @NotNull
    private String storeCode;

    @NotNull
    private Long startTrack;

    @NotNull
    private Long endTrack;

    @Override
    public String toString() {
        return "Cep {" +
                " storeCode='" + storeCode + '\'' +
                ", startTrack=" + startTrack +
                ", endTrack=" + endTrack +
                '}';
    }
}
