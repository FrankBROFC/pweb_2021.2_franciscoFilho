package br.com.frankbr.sistemaPWEB.model;

import br.com.frankbr.sistemaPWEB.enums.Genero;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private long id;
    private String nome;
    private Genero genero;
    @OneToOne
    private Endereco endereco;
    private String email;
    private String telefone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cliente cliente = (Cliente) o;
        return false;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
