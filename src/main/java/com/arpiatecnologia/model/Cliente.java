package com.arpiatecnologia.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Cliente {

    @Id
    private Long id;

    @Column
    private String nome;
}
