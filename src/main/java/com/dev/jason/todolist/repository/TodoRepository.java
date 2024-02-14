package com.dev.jason.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.jason.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
