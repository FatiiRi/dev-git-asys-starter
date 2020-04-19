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

import core.api.models.Task;
import core.api.repositories.TaskRepository;

@RestController
@RequestMapping("/api/v1/todolist")
public class TaskController {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping
	public List<Task> List() {
		return taskRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Task task) {
		taskRepository.save(task);
	}
	
	@GetMapping("{id}")
	public Task get(@PathVariable("id") long id) {
		return taskRepository.getOne(id);
	}
	
}
