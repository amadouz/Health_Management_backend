package com.sante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sante.entites.ParametresExamens;
import com.sante.services.ParametresExamensServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("parametresexamens")
@RestController
public class ParametresExamensController {

	@Autowired
	private ParametresExamensServices parametresExamensServices;
	
	@PostMapping("/save")
	public ParametresExamens save(@RequestBody ParametresExamens paramExam) {
		return parametresExamensServices.enregistrerParamExam(paramExam);
	}
	
	@PutMapping("/update")
	public ParametresExamens update(@RequestBody ParametresExamens paramExam) {
		return parametresExamensServices.modifierParamExam(paramExam);
	}
	
	@GetMapping("/all")
	public List<ParametresExamens> all(){
		return parametresExamensServices.listeParamExamen();
	}
	
	@GetMapping("/parametreexamen/{paramExamId}")
	public ParametresExamens getParametreExamen(@PathVariable(name="paramExamId") Long paramExamId) {
		return parametresExamensServices.unParamExamen(paramExamId);
	}
	
	@DeleteMapping("/delete/{paramExamId}")
	public void delete(@PathVariable(name="paramExamId") Long paramExamId) {
		parametresExamensServices.supprimerParamExamen(paramExamId);
	}
	
	@GetMapping("/examenEnCours/{idConsultation}")
	public List<String> examenEnCours(@PathVariable( name = "idConsultation") Long idConsultation){
		return parametresExamensServices.examenEnCours(idConsultation);
	}
	
	@GetMapping("/parametreParConsultation/{idConsultation}")
	public List<ParametresExamens> lesParametres(@PathVariable( name = "idConsultation") Long idConsultation){
		return parametresExamensServices.parametreParIdConsultation(idConsultation);
	}
}
