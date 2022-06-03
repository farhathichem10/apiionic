package tn.teriak.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.teriak.model.Categorie;
import tn.teriak.repository.ICategorie;




@CrossOrigin("*")

@RestController
@RequestMapping("/cat")
public class CategorieRest {
	@Autowired ICategorie icat;
	@GetMapping("/getall")
	public List <Categorie> getall(){
		
		return (List <Categorie>) icat.findAll(); 
	}
	@PostMapping("/save")
	public void save (@RequestBody Categorie p) {
		icat.save(p);
		
	}

}
