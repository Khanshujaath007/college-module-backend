package com.cg.college1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {
	@Autowired
	private CollegeRepository repository;
//	READ
	public List<College>listAll(){
		return repository.findAll();
	}
//	READ ONE
	public College get(Integer Id) {
		return repository.findById(Id).get();
	}
//	CREATE
	public void save(College college) {
		repository.save(college);
	}
//	DELETE
	public void delete(Integer Id) {
		repository.deleteById(Id);
	}
	//add logic for find by id and update the details
}
