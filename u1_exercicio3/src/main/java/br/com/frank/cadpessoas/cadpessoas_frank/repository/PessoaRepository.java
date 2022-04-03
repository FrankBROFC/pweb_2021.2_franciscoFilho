package br.com.frank.cadpessoas.cadpessoas_frank.repository;

import br.com.frank.cadpessoas.cadpessoas_frank.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
