package com.todotask.service;

import com.todotask.model.Todo;
import com.todotask.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void updateTodo(Todo todo) {
        if (todoRepository.existsById(todo.getId())) {
            todoRepository.save(todo);
        }
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}

