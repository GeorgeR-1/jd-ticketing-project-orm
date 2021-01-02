package com.cybertek.implementation;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.dto.TaskDTO;
import com.cybertek.enums.Status;
import com.cybertek.service.ProjectService;
import com.cybertek.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {

    @Autowired
    TaskService taskService;

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public ProjectDTO save(ProjectDTO object) {
        return super.save(object.getProjectCode(),object);
    }

    @Override
    public void update(ProjectDTO object) {

        ProjectDTO newProject = findById(object.getProjectCode());

        if(object.getProjectStatus() == null){
            object.setProjectStatus(newProject.getProjectStatus());
        }

        super.update(object.getProjectCode(), object);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ProjectDTO object) {
        super.delete(object);
    }

    @Override
    public ProjectDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public void complete(ProjectDTO project) {
        project.setProjectStatus(Status.COMPLETE);
        super.save(project.getProjectCode(),project);
    }

    @Override
    public void changeProjectStatusToComplete(ProjectDTO project) {
        project.setProjectStatus(Status.COMPLETE);
        taskService.findAll().stream()
                .filter(task -> task.getProject().equals(project))
                .forEach(task -> task.setTaskStatus(Status.COMPLETE));

    }

    @Override
    public List<ProjectDTO> completedProjects() {
        return findAll().stream().filter(project -> project.getProjectStatus().equals(Status.COMPLETE))
                .collect(Collectors.toList());
    }
}
