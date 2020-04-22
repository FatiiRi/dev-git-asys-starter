package core.api.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import core.api.dtos.TaskDto;
import core.api.models.Task;
import core.api.repositories.TaskRepository;

public class ListTasksServiceUnitTests {

	@Mock
	private static ListTasksService mockedlistTasksService;
	
	@InjectMocks
	private static TaskRepository mockedTaskRepository;

	private static Task task1;
	private static Task task2;
	
	@BeforeClass
	public static void setUp() {
		
		//mockedTaskRepository = mock(TaskRepository.class);
		//mockedlistTasksService = mock(ListTasksService.class);
		Date date = new Date();
		task1 = new Task((long)1, "myTask1", "some description 1", date, false, "Fatima");
		task2 = new Task((long)2, "myTask2", "some description 2", date, true, "Fatima");
		
		when(mockedTaskRepository.findAll()).thenReturn(Arrays.asList(task1,task2));
		when(mockedTaskRepository.getOne((long)1)).thenReturn(task1);	
	}
	
	@Test
	public void getTasksListTest() {
		List<TaskDto> tasks = mockedlistTasksService.getTasksList();
		 assertEquals(2, tasks.size());
	}

	@Test
	public void getOneTaskTest() {
		TaskDto task = mockedlistTasksService.getOneTask(1);
		assertNotNull(task);
	}

}
