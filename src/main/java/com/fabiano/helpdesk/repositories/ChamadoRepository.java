package com.fabiano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiano.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
