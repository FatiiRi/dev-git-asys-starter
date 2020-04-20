package core.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import core.api.models.Task;
import core.api.repositories.TaskRepository;

@Service
public class ListTasksService {
	
	@Autowired
	private TaskRepository taskRepository;	

	public List<Task> getTasksList() {
		return taskRepository.findAll();
	}
	
	public Task getOneTask(@PathVariable("id") long id) {
		return taskRepository.getOne(id);
	}
}
