package tn.teriak.controllers;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.teriak.model.Produit;
import tn.teriak.repository.IProdRepository;


@CrossOrigin("*")

@RestController
@RequestMapping("/prod")

public class ProduitRest {
	@Autowired IProdRepository iprod;
	@GetMapping("/getall")
	public List <Produit> getall(){
		
		return (List <Produit>) iprod.findAll(); 
	}
	@GetMapping("/count")
	@ResponseBody
	public Long get22() {
		return iprod.count();
	}
	@GetMapping("/getprodbyid/{id}")
		public  Optional<Produit> getprodbyid(@PathVariable ("id")int id){
			
			return  iprod.findById(id);
			
			
		}
	


	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id")int id){
		iprod.deleteById(id);


}
	@PostMapping("/save")
	public void save (@RequestBody Produit p) {
		iprod.save(p);
		
	}
	@PutMapping("/updateprod/{id}")
	 
	  public ResponseEntity<Produit> updateUclt(@PathVariable("id") int id, @RequestBody Produit Clt) {
	    System.out.println("Update type ID = " + id + "...");
	     Optional<Produit> CltData = iprod.findById(id);
	    if (CltData.isPresent()) {
	    	Produit cltt = CltData.get();
	     cltt.setNom(Clt.getNom());
	     cltt.setQte(Clt.getQte());
	    
	     
	      
	     return new ResponseEntity<>(iprod.save(cltt), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } }
	@PutMapping("/valider/{id}")
	 
	  public ResponseEntity<Produit> valid(@PathVariable("id") int id, @RequestBody Produit Clt) {
	    System.out.println("Update type ID = " + id + "...");
	     Optional<Produit> CltData = iprod.findById(id);
	    if (CltData.isPresent()) {
	    	Produit cltt = CltData.get();
	     cltt.setNom(cltt.getNom());
	     cltt.setQte(cltt.getQte());
	     cltt.setEtat("valider");
	     cltt.setCat(cltt.getCat());
	    
	     
	      
	     return new ResponseEntity<>(iprod.save(cltt), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } }
		

	
		
		
		
		
	
	
   }
