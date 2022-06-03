package tn.teriak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.teriak.model.Attestation;



public interface IAttestation extends JpaRepository<Attestation, Integer>{
	@Query("select s from Attestation s where s.us.id=:x")
	public List <Attestation> getallAttestationbyUser(@Param("x")int id);

}
