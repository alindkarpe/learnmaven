package learn.in.model;

import java.util.Date;

public class TaskDomain {
	
	private Long taskId;
	private String taskName;
	private String taskDescription;
	private Integer taskCompletion;
	private Date taskDate;
	/**
	 * 
	 */
	public TaskDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param taskId
	 * @param taskName
	 * @param taskDescription
	 * @param taskCompletion
	 * @param taskDate
	 */
	public TaskDomain(Long taskId, String taskName, String taskDescription, Integer taskCompletion, Date taskDate) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskCompletion = taskCompletion;
		this.taskDate = taskDate;
	}
	/**
	 * @return the taskId
	 */
	public Long getTaskId() {
		return taskId;
	}
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the taskDescription
	 */
	public String getTaskDescription() {
		return taskDescription;
	}
	/**
	 * @param taskDescription the taskDescription to set
	 */
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	/**
	 * @return the taskCompletion
	 */
	public Integer getTaskCompletion() {
		return taskCompletion;
	}
	/**
	 * @param taskCompletion the taskCompletion to set
	 */
	public void setTaskCompletion(Integer taskCompletion) {
		this.taskCompletion = taskCompletion;
	}
	/**
	 * @return the taskDate
	 */
	public Date getTaskDate() {
		return taskDate;
	}
	/**
	 * @param taskDate the taskDate to set
	 */
	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TaskDomain [taskId=" + taskId + ", taskName=" + taskName + ", taskDescription=" + taskDescription
				+ ", taskCompletion=" + taskCompletion + ", taskDate=" + taskDate + "]";
	}
	
	
	
}
