package com.lostit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lostit.Entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	//reference --> https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
	
	List<Item> findByNameIgnoreCase(String name);
	List<Item> findByNameIgnoreCaseContaining(String name);
	List<Item> findByCurrentownerIgnoreCaseContaining(String currentowner);
	List<Item> findByCurrentownerIsNull();
}
