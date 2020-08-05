package com.java.redagenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.redagenda.dominio.Contato;
import com.java.redagenda.dominio.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public List<Contato> buscarTodos(){
		return contatoRepository.findAll();
	}
	
	public Contato buscarPorId(Integer id) {
		return contatoRepository.findById(id).get();
	}
	
	public Contato salvar(Contato contato) {
		return contatoRepository.saveAndFlush(contato);
	}
	
	public void delete(Integer id) {
		contatoRepository.deleteById(id);
	}
}
