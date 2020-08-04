package com.java.redagenda.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.redagenda.dominio.Contato;
import com.java.redagenda.dominio.ContatoRepository;

@Component
public class Data {
	
	@Autowired
	ContatoRepository contatoRepository;
	
	@PostConstruct
	public void salvarTodos() {
		
		List<Contato> listaContatos =  new ArrayList<Contato>();
		Contato c1 = new Contato();
		c1.setNome("Dario Campagna");
		c1.setTelefone("44 99919-5641");
		c1.setLogradouro("Rua x 129");
		c1.setData(LocalDate.now());
		
		Contato c2 = new Contato();
		c2.setNome("Dario Campagna");
		c2.setTelefone("44 99919-5641");
		c2.setLogradouro("Rua x 129");
		c2.setData(LocalDate.now());
		
		Contato c3 = new Contato();
		c3.setNome("Dario Campagna");
		c3.setTelefone("44 99919-5641");
		c3.setLogradouro("Rua x 129");
		c3.setData(LocalDate.now());
		
		listaContatos.add(c1);
		listaContatos.add(c2);
		listaContatos.add(c3);
		
		for(Contato contato: listaContatos) {
			Contato salvarTodos = contatoRepository.save(contato);
			System.out.println(salvarTodos.getId());
		}
	}

}
