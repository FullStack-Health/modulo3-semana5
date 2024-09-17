package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(MockitoExtension.class) // Adiciona o Mockito
@SpringBootTest
class TaskServiceTest {

    @Autowired
    TaskService taskService;

    @Test
    void adicionaTask() {

        String teste = "teste";

        Task resultado = taskService.adicionaTask(teste);

        assertEquals(teste, resultado.getTask());

    }
}