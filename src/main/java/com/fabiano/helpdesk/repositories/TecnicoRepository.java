package com.fabiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiano.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
