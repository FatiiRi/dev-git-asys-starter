package core.api.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long taskId;
	private String taskName; 
	private String description; 
	private Date createdOn;
	private Boolean isDone;
	private String userLogin;

	
	public Task() {
	}

	
	public Task(Long taskId, String taskName, String description, Date createdOn, Boolean isDone, String userLogin) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.createdOn = createdOn;
		this.isDone = isDone;
		this.userLogin = userLogin;
	}


	public Task(String taskName, String description, Date createdOn, Boolean isDone, String userLogin) {
		this.taskName = taskName;
		this.description = description;
		this.createdOn = createdOn;
		this.isDone = isDone;
		this.userLogin = userLogin;
	}
	
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	
	
}
