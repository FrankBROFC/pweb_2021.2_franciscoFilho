package br.com.frankbr.sistemaPWEB.model;

import br.com.frankbr.sistemaPWEB.enums.Genero;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Cliente {
    private long id;
    private String nome;
    private Genero genero;
    private Endereco endereco;
    private String email;
    private String telefone;
}
