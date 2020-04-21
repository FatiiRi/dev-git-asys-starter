package core.api.services;

import core.api.dtos.TaskDto;

public interface IUpsertTasksService {
	
	public void createTask(TaskDto taskDto);
}
