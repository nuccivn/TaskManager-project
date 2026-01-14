package com.vinicius.taskmanager.controller;

import org.springframework.web.bind.annotation.*;

import com.vinicius.taskmanager.DTO.TaskRequestDTO;
import com.vinicius.taskmanager.entity.Task;
import com.vinicius.taskmanager.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task criar(@RequestBody TaskRequestDTO dto) {
        return service.criar(dto);
    }
}
