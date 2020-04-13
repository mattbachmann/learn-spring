package com.baeldung.ls.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.persistence.repository.IProjectRepository;
import com.baeldung.ls.service.IProjectService;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProjectServiceImplSetterInjection implements IProjectService {

    private IProjectRepository projectRepository;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Autowired
    @Qualifier("projectRepositoryImpl2")
    public void setProjectRepository(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public IProjectRepository getprojectRepository() {
        return projectRepository;
    }
}
