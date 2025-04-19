package com.example.myproject;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository; // Импорт JpaRepository
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired; // Импорт autowired

// Импорт Task
import com.example.myproject.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatusIgnoreCase(String status);
}

// Это должен быть интерфейс. Реализация выполняется самим Spring Data JPA.
// Нам не нужен InMemoryTaskRepository, поскольку JPA уже предоставляет реализацию.
// Удалите класс InMemoryTaskRepository.java из вашего проекта.

