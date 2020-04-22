package core.api.services;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import core.api.repositories.TaskRepository;
import core.api.services.Interfaces.IDeleteTasksService;

@Service
public class DeleteTasksService implements IDeleteTasksService{


	@Inject
	private TaskRepository taskRepository;	
	
	public void deleteTask(long id) {
		taskRepository.deleteById(id);		
	}
}
