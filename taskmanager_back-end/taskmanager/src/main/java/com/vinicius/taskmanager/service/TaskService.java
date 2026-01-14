package com.vinicius.taskmanager.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.vinicius.taskmanager.DTO.TaskRequestDTO;
import com.vinicius.taskmanager.entity.Task;
import com.vinicius.taskmanager.entity.TaskStatus;
import com.vinicius.taskmanager.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task criar(TaskRequestDTO dto) {
        Task task = new Task();
        task.setTitulo(dto.getTitulo());
        task.setDescricao(dto.getDescricao());
        task.setStatus(TaskStatus.PENDENTE);
        task.setDataCriacao(LocalDateTime.now());

        return repository.save(task);
    }
}
