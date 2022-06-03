package tn.teriak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.teriak.model.Autorisation;
@Repository

public interface IAutorisation extends JpaRepository<Autorisation, Integer> {
	@Query("select s from Autorisation s where s.user.id=:x")
	public List <Autorisation> getallAutorisationbyUser(@Param("x")int id);


}
