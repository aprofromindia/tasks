package com.github.aprofromindia.tasks.repositories;

import com.github.aprofromindia.tasks.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
