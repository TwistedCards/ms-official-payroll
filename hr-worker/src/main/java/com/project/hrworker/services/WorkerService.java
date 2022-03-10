package com.project.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrworker.entities.Worker;
import com.project.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository workerRepository;
	
	public Worker save(Worker worker) {
		return workerRepository.save(worker);
	}
	
	public List<Worker> findAll() {
		return workerRepository.findAll();
	}
	
	public Worker findById(Long id) {
		return workerRepository.findById(id).get();
	}
}
