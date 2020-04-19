package core.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import core.api.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
