package com.fabiano.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiano.helpdesk.domain.Chamado;
import com.fabiano.helpdesk.domain.Cliente;
import com.fabiano.helpdesk.domain.Tecnico;
import com.fabiano.helpdesk.domain.enums.Perfil;
import com.fabiano.helpdesk.domain.enums.Prioridade;
import com.fabiano.helpdesk.domain.enums.Status;
import com.fabiano.helpdesk.repositories.ChamadoRepository;
import com.fabiano.helpdesk.repositories.ClienteRepository;
import com.fabiano.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;	
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Fabiano Bertoldo", "01968951385", "fabiano@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "José Victor", "00123456385", "jv@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01 ", "primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
