package com.sante.controllers;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sante.entites.User;
import com.sante.entites.Utilisateurs;
import com.sante.services.UserService;
import com.sante.services.UtilisateursServices;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("utilisateurs")
@RestController
public class UtilisateursController {

	@Autowired
	private UtilisateursServices utilisateursServices;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public Utilisateurs save(@RequestBody Utilisateurs utilisateur) {
		Date date = new Date();
		
		int an = date.getYear()+1900;		
		int mois = date.getMonth();
		int jr = date.getDay();
		String userName = an%2 + mois%3 + jr%2+"";
		Random ran = new Random();
		int nbRand = ran.nextInt(1000);
		String strRand = nbRand+"";
		if(strRand.length() == 1) {
			strRand+="000";
		}else if(strRand.length() == 2) {
			strRand+="00";
		}else if(strRand.length() == 3) {
			strRand+="0";
		}
		int nb = utilisateursServices.nombreUser();
		userName+=nb+strRand;
		utilisateur.setUsername(userName);
		return utilisateursServices.enregistrerUtilisateur(utilisateur);
	}
	
	@PostMapping("/saveUser")
	public User save(@RequestBody User user) {

		return userService.enregistrement(user);
	}
	
	@PutMapping("/update")
	public Utilisateurs update(@RequestBody Utilisateurs utilisateur) {
		return utilisateursServices.modifierUtilisateur(utilisateur);
	}
	
	@GetMapping("/all")
	public List<Utilisateurs> all(){
		return utilisateursServices.listeUtilisateurs();
	}
	
	@GetMapping("/utilisateur")	
	public Utilisateurs lesUsers(@RequestParam(name="username") String username){
		return utilisateursServices.uneConnexion(username);
	}
	@GetMapping("/utilisateur/{utilisateurId}")
	public Utilisateurs getUtilisateur(@PathVariable(name="utilisateurId") Long utilisateurId) {
		return utilisateursServices.unUtilsateur(utilisateurId);
	}
	
	@DeleteMapping("/delete/{utilisateurId}")
	public void delete(@PathVariable(name="utilisateurId") Long utilisateurId) {
		utilisateursServices.supprimerUtilisateur(utilisateurId);
	}
	
	@PutMapping("/suspendreUser")
	public Utilisateurs suspendreUser(@RequestBody Utilisateurs user) {
		user.setEtat(0);
		return utilisateursServices.suspendreUtilisateur(user);
	}
	
	@PutMapping("/activerUser")
	public Utilisateurs activerUser(@RequestBody Utilisateurs user) {
		user.setEtat(1);
		return utilisateursServices.activerUtilisateur(user);
	}
	
	/*@PutMapping("/suspendreService/{serviceId}")
	public int suspendreService(@PathVariable(name = "serviceId") Long serviceId) {
		return utilisateursServices.suspendreService(serviceId);
	}*/
	
	@PutMapping("/activerService/{serviceId}")
	public int activerService(@PathVariable(name = "sericeId") Long serviceId) {
		return utilisateursServices.activerService(serviceId);
	}
	
	
	//Connexion 
	
	@GetMapping("/login")
	public Utilisateurs login(@RequestParam("username") String username, @RequestParam("password") String password) {
		return utilisateursServices.findLogin(username, password);
	}
}
