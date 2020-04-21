package core.api.dtos;

import java.util.Date;

public class TaskDto {
	public Long taskId;
	public String taskName; 
	public String description; 
	public Date createdOn;
	public Boolean isDone;
	public String userLogin;
}
