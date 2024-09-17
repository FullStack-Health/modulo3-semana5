package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Adiciona o Mockito
class TaskServiceUnitTest {

    @Mock
    TaskRepository repository;

    @InjectMocks
    TaskService taskService;

    @Test
    void adicionaTask() {

        // Dado
        String teste = "teste";
        Task task = new Task(teste);
        when(repository.save(any())).thenReturn(task);

        // Quando
        Task resultado = taskService.adicionaTask(teste);

        // Então
        assertEquals(teste, resultado.getTask());
    }

    @Test
    void adicionaTaskBDD() {

        // Dado
        String teste = "teste";
        Task task = new Task(teste);
        given(repository.save(any())).willReturn(task);

        // Quando
        Task resultado = taskService.adicionaTask(teste);

        // Então
        assertEquals(teste, resultado.getTask());
        then(repository)
                .should()
                .save(any());

    }


}