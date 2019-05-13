package com.una.springreact.springreact.service;

import com.una.springreact.springreact.domain.Project;
import com.una.springreact.springreact.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        return projectRepository.save(project);

    }

}
