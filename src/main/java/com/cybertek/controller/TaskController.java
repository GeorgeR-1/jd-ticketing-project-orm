package com.cybertek.controller;

import com.cybertek.dto.TaskDTO;
import com.cybertek.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.UUID;

@Controller
@RequestMapping("/task")
public class TaskController {

//    @Autowired
//    ProjectService projectService;
//    @Autowired
//    UserService userService;
//    @Autowired
//    TaskService taskService;
//
//    @GetMapping("/create")
//    public String createTask(Model model) {
//
//        model.addAttribute("task", new TaskDTO());
//        model.addAttribute("projects", projectService.findAll());
//        model.addAttribute("employees", userService.findEmployees());
//        model.addAttribute("tasks", taskService.findAll());
//
//        return "task/create";
//    }
//
//    @PostMapping("/create")
//    public String insertTask(Model model, TaskDTO task) {
//
//        task.setTaskStatus(Status.OPEN);
//        task.setAssignedDate(LocalDate.now());
//        task.setId(UUID.randomUUID().getMostSignificantBits());
//
//        System.out.println("Auto generated ID : " + task.getId());
//
//        taskService.save(task);
//
//        return "redirect:/task/create";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteTask(@PathVariable("id") Long id) {
//        taskService.deleteById(id);
//        return "redirect:/task/create";
//    }
//
//    @GetMapping("/update/{id}")
//    public String editTask(@PathVariable("id") Long id, Model model) {
//
//        model.addAttribute("task", taskService.findById(id));
//        model.addAttribute("projects", projectService.findAll());
//        model.addAttribute("employees", userService.findEmployees());
//        model.addAttribute("tasks", taskService.findAll());
//
//        return "task/update";
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateTask(@PathVariable("id") Long id, TaskDTO task, Model model) {
//
//        taskService.update(task);
//
//        return "redirect:/task/create";
//    }
//
//    @GetMapping("/list")
//    public String showTaskList(Model model) {
//
//        model.addAttribute("tasks", taskService.findAll());
//
//
//        return "employee/task-status";
//    }
//
//    @GetMapping("/updateStatus/{taskID}")
//    public String editTaskStatus(@PathVariable("taskID")Long id, Model model){
//
//        model.addAttribute("task", taskService.findById(id));
//        model.addAttribute("projects", projectService.findAll());
//        model.addAttribute("employees", userService.findEmployees());
//        model.addAttribute("tasks", taskService.findAll());
//        model.addAttribute("statuses", Status.values());
//
//
//        return "employee/update-task";
//    }
//
//    @PostMapping("/updateStatus/{taskID}")
//    public String updateTaskStatus(@PathVariable("taskID") Long id, TaskDTO taskDTO) {
//
//        taskService.updateTaskStatus(id, taskDTO.getTaskStatus());
//
//        return "redirect:/task/list";
//    }


}
