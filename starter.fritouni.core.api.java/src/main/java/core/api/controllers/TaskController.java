package core.api.controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import core.api.dtos.TaskDto;
import core.api.services.DeleteTasksService;
import core.api.services.ListTasksService;
import core.api.services.UpsertTasksService;

@RestController
@RequestMapping("/api/v1/todolist")
public class TaskController {
	
	
	@Inject
	private ListTasksService listTasksService;
	@Inject 
	private UpsertTasksService upsertTasksService;
	@Inject
	private DeleteTasksService deleteTasksService;
	
	@GetMapping
	public List<TaskDto> getTasksList() {
		return listTasksService.getTasksList();
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.OK)
	public void createTask(@RequestBody TaskDto taskDto) {
		upsertTasksService.createTask(taskDto);
	}
	
	@GetMapping("{id}")
	public TaskDto getOneTask(@PathVariable("id") long id) {
		
		return listTasksService.getOneTask(id);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteTask(@PathVariable("id") long id) {
		deleteTasksService.deleteTask(id);
	}
	
}
