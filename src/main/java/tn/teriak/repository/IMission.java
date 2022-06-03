package tn.teriak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.teriak.model.Mission;

@Repository
public interface IMission extends JpaRepository<Mission, Integer> {

}
