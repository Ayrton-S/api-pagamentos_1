package edu.uea.dsw.api_pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//asfddh
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Lancamento {
    private Long codigo;
    private String descricao;
    private String dataVencimento;
    private String dataPagamento;
    private Double valor;
    private String observacao;
    private TipoLancamento tipo;
}
