package core.api.services.Interfaces;

import core.api.dtos.TaskDto;

public interface IUpsertTasksService {
	
	public void createTask(TaskDto taskDto);
	public void updateTask(TaskDto taskDto);
}
