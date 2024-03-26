package com.tiwilli.hrworker.services;

import com.tiwilli.hrworker.dto.WorkerDTO;
import com.tiwilli.hrworker.entities.Worker;
import com.tiwilli.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;

    @Transactional(readOnly = true)
    public List<WorkerDTO> findAll() {
        List<Worker> list = repository.findAll();
        return list.stream().map(WorkerDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public WorkerDTO findById(Long id) {
        Worker obj = repository.findById(id).get();
        return new WorkerDTO(obj);
    }
}
