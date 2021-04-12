package com.challenge.globalSys.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(schema = "challenge", name = "CEP")
public class Cep implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true, updatable = false)
    private UUID id;

    @Column(name = "store_code")
    private String storeCode;

    @Column(name = "start_track")
    private Long startTrack;

    @Column(name = "end_track")
    private Long endTrack;

}
