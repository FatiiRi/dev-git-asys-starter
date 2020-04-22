package core.api.services.Interfaces;

import core.api.dtos.TaskDto;

public interface IUpsertTasksService {
	
	public void upsertTask(TaskDto taskDto);
}
