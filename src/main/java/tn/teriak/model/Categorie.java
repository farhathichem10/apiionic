package tn.teriak.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer id ;
	@Column(nullable = false)
	private String nom;
	  @JsonIgnore
	@OneToMany (cascade = CascadeType.ALL,mappedBy = "cat")
	private List <Produit> liste;
	public Categorie() {
		super();
	}
	public Categorie(Integer id, String nom, List<Produit> liste) {
		super();
		this.id = id;
		this.nom = nom;
		this.liste = liste;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Produit> getListe() {
		return liste;
	}
	public void setListe(List<Produit> liste) {
		this.liste = liste;
	}


}
