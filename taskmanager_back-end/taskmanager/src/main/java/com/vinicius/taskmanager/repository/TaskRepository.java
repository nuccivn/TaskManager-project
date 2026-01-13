package com.vinicius.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.taskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    
}
