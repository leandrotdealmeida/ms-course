package com.devjapa.hrworker.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjapa.hrworker.domain.Worker;
import com.devjapa.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	private WorkerRepository repository;	
	
	public WorkerResource(WorkerRepository repository) {		
		this.repository = repository;
	}

	@GetMapping	
	public ResponseEntity<List<Worker>> findAll() {
		return ResponseEntity.ok().body(repository.findAll());
	}
	
	@GetMapping(value = "/{id}")	
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(repository.findById(id).get());
	}

}
