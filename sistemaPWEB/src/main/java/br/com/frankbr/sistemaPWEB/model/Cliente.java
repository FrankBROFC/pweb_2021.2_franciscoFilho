package br.com.frankbr.sistemaPWEB.model;

import br.com.frankbr.sistemaPWEB.enums.Genero;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private long id;
    private String nome;
    private Genero genero;
    @OneToOne
    private Endereco endereco;
    private String email;
    private String telefone;

}
