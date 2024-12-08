package com.example.todoSchedulerProject.repository;

import com.example.todoSchedulerProject.domain.Todo;
import com.example.todoSchedulerProject.dto.TodoResponseDto;

import java.util.List;

public interface TodoRepository {

    // 속성

    // 생성자

    // 기능
    TodoResponseDto createTodo(Todo todo);

    List<TodoResponseDto> searchAllTodos(String updated_date, String writer);

    Todo searchTodoById(Long id);

    void deleteTodo(Long id);
}
