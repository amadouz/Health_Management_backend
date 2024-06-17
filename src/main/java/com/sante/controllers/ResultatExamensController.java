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

import com.sante.entites.ResultatExamens;
import com.sante.services.ResultatExamensServices;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("resultatsexamens")
@RestController

public class ResultatExamensController {

	@Autowired
	private ResultatExamensServices resultatExamenService;
	
	@PostMapping("/save")
	public ResultatExamens save(@RequestBody ResultatExamens resultatExam) {
		return resultatExamenService.enregistrerResultatExam(resultatExam);
	}
	
	@PutMapping("/update")
	public ResultatExamens update(@RequestBody ResultatExamens resultatExam){
		return resultatExamenService.modifierResultatExam(resultatExam);
	}
	
	@GetMapping("/all")
	public List<ResultatExamens> all() {
		return resultatExamenService.listeResultatsExamen();
	}
	
	@GetMapping("/resultatexamen/{resultatExamId}")
	public ResultatExamens getResultatExamens(@PathVariable(name="resultatExamId") Long resultatExamId) {
		return resultatExamenService.unResultatExamen(resultatExamId);
	}
	
	@DeleteMapping("/delete/{resultatExamId}")
	public void delete(@PathVariable(name="resultatExamId") Long resultatExamId) {
		resultatExamenService.supprimerResultatExamen(resultatExamId);
	}
	
	@GetMapping("/resultatParConsultation/{consultationId}")
	public List<ResultatExamens> resultatParConsultation(@PathVariable(name = "consultationId") Long consultationId){
		return resultatExamenService.resultatParConsultation(consultationId);
	}
	
	@GetMapping("/resultatParLaborantin/{laborantinId}")
	public List<ResultatExamens> resultatParLaborantin(@PathVariable(name = "laborantinId") Long laborantinId){
		return resultatExamenService.resultatParLaborantin(laborantinId);
	}
}
