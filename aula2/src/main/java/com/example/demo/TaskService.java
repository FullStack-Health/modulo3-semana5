package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public Task adicionaTask(String task){
        return repository.save(new Task(task));
    }
}
