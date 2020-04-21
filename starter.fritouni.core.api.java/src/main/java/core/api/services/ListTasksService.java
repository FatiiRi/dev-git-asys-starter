package core.api.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.api.dtos.TaskDto;
import core.api.models.Task;
import core.api.repositories.TaskRepository;

@Service
public class ListTasksService {
	
	@Autowired
	private TaskRepository taskRepository;	

	public List<TaskDto> getTasksList() {
		return taskRepository.findAll().stream().map(task -> new TaskDto(
				task.getTaskId(),
				task.getTaskName(),
				task.getDescription(),
				task.getCreatedOn(),
				task.getIsDone(),
				task.getUserLogin()
				)).collect(Collectors.toList());
	}
	
	public TaskDto getOneTask(long id) {
		Task task = taskRepository.getOne(id);
		return new TaskDto(
				task.getTaskId(),
				task.getTaskName(),
				task.getDescription(),
				task.getCreatedOn(),
				task.getIsDone(),
				task.getUserLogin()
				);
	}
}
