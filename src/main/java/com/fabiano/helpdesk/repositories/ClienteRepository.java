package com.fabiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiano.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}
