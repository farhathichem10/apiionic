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

import tn.teriak.model.Congee;
import tn.teriak.repository.ICongee;



@CrossOrigin("*")

@RestController
@RequestMapping("/con")
public class CongeeRest {
	@Autowired ICongee con;
	@GetMapping("/getall")
	public List <Congee> getall(){
		return (List <Congee>) con.findAll();
	}
	@PostMapping("/save")
	public void save(@RequestBody Congee c) {
		c.setReponserh("en_cours");
		c.setReponsesup("en_cours");
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		c.setDatetime(timeStamp);
		con.save(c);
	}
	@GetMapping("getcongeebyuser/{id}")
	public List <Congee>GetCongeeByUser(@PathVariable int id){
		return (List <Congee>) con.getallCongeebyUser(id);
		
	}
	

}
