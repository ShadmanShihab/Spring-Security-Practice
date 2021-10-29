package com.project.blogsite.service;

import com.project.blogsite.model.Programmer;
import com.project.blogsite.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammerService {
    @Autowired
    ProgrammerRepository programmerRepository;

    public void save(Programmer programmer) {
        programmerRepository.save(programmer);
    }

    public List<Programmer> show() {
        return programmerRepository.findAll();
    }
}
