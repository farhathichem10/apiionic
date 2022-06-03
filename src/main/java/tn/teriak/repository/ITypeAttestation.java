package tn.teriak.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.teriak.model.TypeAttestation;

@Repository
public interface ITypeAttestation extends JpaRepository<TypeAttestation, Integer> {
	

}
