package core.api.services;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TasksServiceTests {
	private ListTasksService listTaskService;
	@Before
	public void setUp() {
		listTaskService = new ListTasksService();
		
	}
	
	@Test
	public void listTaskService_getListTask_test() {
		//assertThrows(Exception.class, listTaskService.getTasksList());
	}

}
