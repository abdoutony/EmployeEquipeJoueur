package com.example.EquipeJoeurGroup.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EquipeJoeurGroup.dao.EquipeRepository;
import com.example.EquipeJoeurGroup.entities.Equipe;

@RestController
public class EquipeController {
    
	private EquipeRepository equipeRepository;
	
	public EquipeController(EquipeRepository equipeRepository) {
		this.equipeRepository = equipeRepository;
	}
	
	
    // GET ALL Equipe
	@GetMapping(path="/equipes")
	public List<Equipe> getallEquipe(){
		return equipeRepository.findAll();
	}
	
	
	// add new equipe
	@PostMapping(value="/equipes")
	public Equipe addNewEquipe(@RequestBody Equipe equipe) {
		return equipeRepository.save(equipe);
	}
	
	
	// update equipe
	@PutMapping(value="/equipes/{id}")
	public Equipe updateEquipe(@PathVariable(name="id") Long id, @RequestBody Equipe equipe) {
	  equipe.setId(id);
	  return equipeRepository.save(equipe);
	}
	
	//delete equipe
	@DeleteMapping(value="/equipes/{id}")
    public void deleteEquipe(@PathVariable(name="id")Long id) {
		equipeRepository.deleteById(id);
	}
	
	
	// request 
	
	@GetMapping(path="/equipes/searchByName")
	public List<Equipe> searchEquipeByName(@RequestParam("name") String nom){
		//return equipeRepository.findByNomContains(nom);
		return null;
	}
	
	
	
}
