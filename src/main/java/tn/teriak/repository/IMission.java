package tn.teriak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.teriak.model.Mission;

@Repository
public interface IMission extends JpaRepository<Mission, Integer> {
	@Query("select s from Mission s where s.user.id=:x")
	public List <Mission> getallMissionbyUser(@Param("x")int id);

}
