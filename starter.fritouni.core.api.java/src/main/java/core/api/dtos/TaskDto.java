package core.api.dtos;

import java.util.Date;

public class TaskDto {
	
	public Long taskId;
	public String taskName; 
	public String description; 
	public Date createdOn;
	public Boolean isDone;
	public String userLogin;
	
	public TaskDto() {
	}

	public TaskDto(Long taskId, String taskName, String description, Date createdOn, Boolean isDone, String userLogin) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.createdOn = createdOn;
		this.isDone = isDone;
		this.userLogin = userLogin;
	}
	
	
	
}
