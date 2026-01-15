package com.vinicius.taskmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.vinicius.taskmanager.DTO.TaskRequestDTO;
import com.vinicius.taskmanager.entity.Task;
import com.vinicius.taskmanager.service.TaskService;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // LISTAR: Retorna todas as tarefas em formato JSON
    @GetMapping
    public List<Task> listarTodos() {
        return service.listarTodos();
    }

    // CRIAR: Recebe os dados da tarefa e salva no banco
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task criar(@RequestBody TaskRequestDTO dto) {
        return service.criar(dto);
    }

    // ATUALIZAR: Altera o status ou dados de uma tarefa existente pelo ID
    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        return service.update(id, task);
    }

    // ELIMINAR: Remove a tarefa do sistema e retorna "No Content" (Sucesso sem corpo)
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}