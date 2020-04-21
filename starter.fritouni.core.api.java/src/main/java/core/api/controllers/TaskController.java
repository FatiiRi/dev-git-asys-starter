package core.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import core.api.dtos.TaskDto;
import core.api.models.Task;
import core.api.services.ListTasksService;
import core.api.services.UpsertTasksService;

@RestController
@RequestMapping("/api/v1/todolist")
public class TaskController {
	
	
	@Autowired
	private ListTasksService listTasksService;
	@Autowired 
	private UpsertTasksService upsertTasksService;
	
	@GetMapping
	public List<Task> getTasksList() {
		return listTasksService.getTasksList();
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.OK)
	public void createTask(@RequestBody TaskDto taskDto) {
		upsertTasksService.createTask(taskDto);
	}
	
	@GetMapping("{id}")
	public Task getOneTask(@PathVariable("id") long id) {
		
		return listTasksService.getOneTask(id);
	}
	
}
