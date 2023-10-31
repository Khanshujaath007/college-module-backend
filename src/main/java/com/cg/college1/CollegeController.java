package com.cg.college1;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CollegeController {
	@Autowired
	private CollegeService service;
	
//	Retrieval
	@GetMapping("/colleges")
	public List<College>lis(){
		return service.listAll();
	}
	
//	Retrieval by id
	@GetMapping("/colleges/{id}")
	public ResponseEntity<College>get(@PathVariable Integer id){
		 try {
			College college = service.get(id);
			 return new ResponseEntity<College>(college,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Create
	@PostMapping("/colleges")
	public void add(@RequestBody College college) {
		service.save(college);
	}
	
//	Update
	@PutMapping("/colleges/{id}")
	public ResponseEntity<?>update(@RequestBody College college,@PathVariable Integer id){
		try {
			College foundCollege = service.get(id);
			service.save(college);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}
	
//	Delete
	@DeleteMapping("/colleges/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
