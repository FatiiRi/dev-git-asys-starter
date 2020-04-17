package core.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import core.api.models.Task;

@RestController
@RequestMapping("/api/v1/todolist")
public class TaskController {
	@GetMapping
	public List<Task> List() {
		List<Task> tasks = new ArrayList<>();
		return tasks;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Task task) {
		
	}
	
	@GetMapping("{id}")
	public Task get(@PathVariable("id") long id) {
		return new Task();
	}
	
}
