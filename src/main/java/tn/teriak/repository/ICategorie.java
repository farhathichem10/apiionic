package tn.teriak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.teriak.model.Categorie;


public interface ICategorie extends JpaRepository<Categorie, Integer> {

}
