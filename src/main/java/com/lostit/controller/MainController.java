package com.lostit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lostit.Entity.Item;
import com.lostit.repository.ItemRepository;

@Controller
@RequestMapping(path="/")
public class MainController {

	@Autowired
	private ItemRepository repo;
	
	
	@GetMapping(path="/items")
	public @ResponseBody List<Item> items() {
		return repo.findAll();
	}
	
	@GetMapping(path="/item")
	public @ResponseBody List<Item> item(@RequestParam String name) {
		return repo.findByNameIgnoreCaseContaining(name);
	}
	
	//NOTE: To get all Items with owners not null--> http://localhost:8080/owner?currentowner
	//http://localhost:8080/owner?currentowner=Jack
	@GetMapping(path="/owner")
	public @ResponseBody List<Item> itemFromOwner(@RequestParam String currentowner) {
		return repo.findByCurrentownerIgnoreCaseContaining(currentowner);
	}
	
	//To get all owners
	@GetMapping(path="/owners")
	public @ResponseBody List<Item> findItemsWithoutOwner() {
		return repo.findByCurrentownerIsNull();
	}
	
	//Note: Use @ModelAttribute for data from "form" 
	@PostMapping("/store")
	public  @ResponseBody Item store(@Valid @RequestBody Item item) {
		return repo.saveAndFlush(item);
	}
	
}
