package br.com.frankbr.sistemaPWEB.repository;

import br.com.frankbr.sistemaPWEB.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
