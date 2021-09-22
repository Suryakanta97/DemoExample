package com.surya.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.surya.app.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
