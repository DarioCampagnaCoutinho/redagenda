package com.java.redagenda.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.redagenda.dominio.Contato;
import com.java.redagenda.service.ContatoService;

@Controller
public class ContatoControler {
	
	@Autowired
	private ContatoService contatoService;
	
	@GetMapping("/adicionar")
	public ModelAndView adicionar(Contato contato) {
		ModelAndView mv = new ModelAndView("/adicionar-contato");
		mv.addObject("contato", contato);
		return mv;
	}
	
	@GetMapping("/")
	public ModelAndView buscarTodos() {
		ModelAndView mv = new ModelAndView("/contato");
		mv.addObject("contatos", contatoService.buscarTodos());
		return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvarContato(Contato contato) {
		
		contatoService.salvar(contato);
		
		return buscarTodos();
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editarContato(@PathVariable("id") Integer id) {
		return adicionar(contatoService.buscarPorId(id));
	}

}
