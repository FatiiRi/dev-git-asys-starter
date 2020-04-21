package core.api.services;

import java.util.List;

import core.api.dtos.TaskDto;

public interface IListTasksService {
	public List<TaskDto> getTasksList();
	public TaskDto getOneTask(long id);
}
