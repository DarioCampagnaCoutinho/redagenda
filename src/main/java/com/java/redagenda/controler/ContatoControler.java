package com.java.redagenda.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.redagenda.service.ContatoService;

@Controller
public class ContatoControler {
	
	@Autowired
	private ContatoService contatoService;
	
	@GetMapping("/")
	public ModelAndView buscarTodos() {
		ModelAndView mv = new ModelAndView("/contato");
		mv.addObject("contatos", contatoService.buscarTodos());
		return mv;
	}

}
