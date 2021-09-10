package br.com.wildrimak.security.oauth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wildrimak.security.oauth.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
