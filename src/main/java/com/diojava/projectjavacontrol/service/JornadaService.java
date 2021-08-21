package com.diojava.projectjavacontrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.diojava.projectjavacontrol.model.JornadaTrabalho;
import com.diojava.projectjavacontrol.repository.JornadaRepository;

@Service
public class JornadaService {
	
	JornadaRepository jornadaRepository;

	@Autowired
	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}

	@PostMapping
	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	@GetMapping
	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	}

	
	public Optional<JornadaTrabalho> getById(Long idJornada) {
		return jornadaRepository.findById(idJornada);
	}
	
	@PostMapping
	public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}
	
	public void deleteJornada(Long idJornada) {
		 jornadaRepository.deleteById(idJornada);
	}

}
