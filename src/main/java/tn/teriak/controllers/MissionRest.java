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

import tn.teriak.model.Mission;
import tn.teriak.repository.IMission;



@CrossOrigin("*")

@RestController
@RequestMapping("/mission")
public class MissionRest {
	@Autowired IMission miss;
	@GetMapping("/getall")
	public List<Mission> getall(){
		return (List<Mission>) miss.findAll();}
	@PostMapping("/save")
	public void add(@RequestBody Mission m) {
		m.setReponserh("en-cours");
		m.setReponsesup("en-cours");
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		
		m.setDatetime(timeStamp);

		miss.save(m);
	}
	@GetMapping("/getmissionbyuserid/{id}")
	public List<Mission> getallmissionbyuser(@PathVariable("id")int id){
		return (List<Mission>) miss.getallMissionbyUser(id);}

}
