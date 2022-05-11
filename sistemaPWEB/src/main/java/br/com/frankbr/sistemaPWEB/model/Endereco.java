package br.com.frankbr.sistemaPWEB.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private long id;
    private String endereco;
    private String cidade;
    private int cep;
}
