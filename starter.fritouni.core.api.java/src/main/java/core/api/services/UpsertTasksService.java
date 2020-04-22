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

	public void upsertTask(TaskDto taskDto) {
		Task task = new Task(
				taskDto.taskId,
				taskDto.taskName,
				taskDto.description,
				taskDto.createdOn,
				taskDto.isDone,
				taskDto.userLogin
				);
		taskRepository.save(task);
		
	}
}
