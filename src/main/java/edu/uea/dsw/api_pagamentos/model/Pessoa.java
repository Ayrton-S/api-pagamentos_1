package edu.uea.dsw.api_pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Implementado da classe Pessoa
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private Long codigo;
    private String nome;
    private Boolean ativo;
}
