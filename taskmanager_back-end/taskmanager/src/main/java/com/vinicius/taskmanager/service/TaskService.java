package com.vinicius.taskmanager.service;

import java.time.LocalDateTime;
import java.util.List;
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

    public List<Task> listarTodos() {
        return repository.findAll(); // Agora devolve a lista real
    }

    public Task criar(TaskRequestDTO dto) {
        Task task = new Task();
        task.setTitulo(dto.getTitulo());
        task.setDescricao(dto.getDescricao());
        task.setStatus(TaskStatus.PENDENTE);
        task.setDataCriacao(LocalDateTime.now());
        return repository.save(task);
    }

    public Task update(Long id, Task taskAtualizada) {
        return repository.findById(id).map(task -> {
            task.setStatus(taskAtualizada.getStatus()); // Ex: Mudar para CONCLUIDO
            return repository.save(task);
        }).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}