package com.fabiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiano.helpdesk.domain.Cliente;

public interface PessoaRepository extends JpaRepository<Cliente, Integer>{

}
