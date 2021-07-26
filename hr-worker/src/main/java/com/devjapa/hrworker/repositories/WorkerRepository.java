package com.devjapa.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.hrworker.domain.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
