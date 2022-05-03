package br.com.frankbr.sistemaPWEB.model;

import lombok.Data;

@Data
public class Endereco {
    private String endereco;
    private String cidade;
    private int cep;
}
