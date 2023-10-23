package com.demo.Repository.AnkempmsRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.Model.Ankempms.Ankempms;


@Repository
public interface AnkempmsRepository extends JpaRepository<Ankempms, Integer> {
    
	@Query(nativeQuery = true, value = "SELECT * FROM ANKEMPMS;")
	List<Ankempms> getAnkempmsList();
	
}
