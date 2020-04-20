package core.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import core.api.models.Task;
import core.api.repositories.TaskRepository;

@Service
public class UpsertTasksService {
	@Autowired
	private TaskRepository taskRepository;	

	public void createTask(@RequestBody Task task) {
		taskRepository.save(task);
	}
}
