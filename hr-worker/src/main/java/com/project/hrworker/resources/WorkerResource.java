package com.project.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrworker.entities.Worker;
import com.project.hrworker.services.WorkerService;

@RefreshScope
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping(value = "/allWorkers")
	public ResponseEntity<List<Worker>> findAll() {
		return ResponseEntity.ok(workerService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		return ResponseEntity.ok(workerService.findById(id));
	}
	
	@PostMapping(value = "/save", consumes = "application/json")
	public ResponseEntity<Worker> saveWorke(@RequestBody Worker worker){
		return ResponseEntity.ok(workerService.save(worker));
	}
	
}
