package com.todotask.service;

import com.todotask.model.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TodoServiceTest {

    @Autowired
    private TodoService todoService;

    @Test
    public void testSaveTodo() {
        Todo todo = new Todo();
        todo.setTitle("Test Todo");
        todo.setDescription("Test Description");

        Todo savedTodo = todoService.createTodo(todo);

        assertNotNull(savedTodo.getId());
        assertEquals("Test Todo", savedTodo.getTitle());
        assertEquals("Test Description", savedTodo.getDescription());
    }

    @Test
    public void testGetTodoById() {
        Todo todo = new Todo();
        todo.setTitle("Test Todo");
        todo.setDescription("Test Description");

        Todo savedTodo = todoService.createTodo(todo);

        Todo retrievedTodo = todoService.getTodoById(savedTodo.getId());

        assertNotNull(retrievedTodo);
        assertEquals(savedTodo.getId(), retrievedTodo.getId());
        assertEquals("Test Todo", retrievedTodo.getTitle());
        assertEquals("Test Description", retrievedTodo.getDescription());
    }

}

