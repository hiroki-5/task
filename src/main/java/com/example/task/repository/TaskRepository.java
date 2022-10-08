package com.example.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * タスクのリポジトリー.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}