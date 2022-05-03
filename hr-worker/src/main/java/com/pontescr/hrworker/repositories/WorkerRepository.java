package com.pontescr.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontescr.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
