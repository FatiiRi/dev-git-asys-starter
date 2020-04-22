package core.api.services;

import org.springframework.stereotype.Service;
import javax.inject.Inject;

import core.api.dtos.TaskDto;
import core.api.models.Task;
import core.api.repositories.TaskRepository;
import core.api.services.Interfaces.IUpsertTasksService;

@Service
public class UpsertTasksService implements IUpsertTasksService {
	
	@Inject
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

	public void updateTask(TaskDto taskDto) {
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
