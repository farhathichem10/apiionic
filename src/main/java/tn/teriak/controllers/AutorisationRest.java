package tn.teriak.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.teriak.model.Autorisation;
import tn.teriak.repository.IAutorisation;



@CrossOrigin("*")

@RestController
@RequestMapping("/autorisation")

public class AutorisationRest {
	
	@Autowired  IAutorisation at;
	@GetMapping("/findall")
	public List <Autorisation> getall(){
		return (List<Autorisation>) at.findAll();}
	@PostMapping("/save")
	public void save (@RequestBody Autorisation a) {
		a.setReponserh("en_cours");
		a.setReponsesup("en_cours");
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		a.setDate_emission(timeStamp);
		at.save(a);
	}
	@GetMapping("/getallAutorisationbyUser/{id}")
	public List <Autorisation> getallAutorisationbyUser(@PathVariable("id")int id){
		return (List<Autorisation>) at.getallAutorisationbyUser(id);
	}
	

}
