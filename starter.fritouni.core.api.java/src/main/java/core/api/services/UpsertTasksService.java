package core.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.api.dtos.TaskDto;
import core.api.models.Task;
import core.api.repositories.TaskRepository;

@Service
public class UpsertTasksService {
	@Autowired
	private TaskRepository taskRepository;	

	public void createTask(TaskDto taskDto) {
		Task task = new Task(
				taskDto.taskName,
				taskDto.description,
				taskDto.createdOn,
				taskDto.isDone,
				taskDto.userLogin
				);
		taskRepository.save(task);
	}
}
