package br.com.frankbr.sistemaPWEB.dtos;

import br.com.frankbr.sistemaPWEB.model.Cliente;
import br.com.frankbr.sistemaPWEB.model.Endereco;
import lombok.Data;

@Data
public class ClienteDTO {
    private String nome;
    private String genero;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private int cep;

    public Cliente toCliente() {
        Cliente cliente = new Cliente();

        cliente.setNome(this.getNome());
        cliente.setGenero(this.getGenero());
        cliente.setEmail(this.getEmail());
        cliente.setTelefone(this.getTelefone());

        return cliente;
    }

    public Endereco toEndereco() {
        Endereco endereco = new Endereco();

        endereco.setEndereco(this.getEndereco());
        endereco.setCidade(this.getCidade());
        endereco.setCep(this.getCep());

        return endereco;
    }
}
