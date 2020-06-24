package learn.in.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import learn.in.model.TaskDomain;
@Repository
public class TaskRepository {
	
	private static Map<Long, TaskDomain> taskRepo = new HashMap<>();
	static {
		Long taskId = System.currentTimeMillis();
		
		TaskDomain task1 = new TaskDomain (taskId,"Complete homework", "complete maths,physics,chem homework",10,new Date());
		taskRepo.put(taskId,task1);
		
		taskId = System.currentTimeMillis();
		TaskDomain task2 = new TaskDomain (taskId,"Complete task", "complete maths,hindi homework",25,new Date());
		taskRepo.put(taskId,task2);
	}
	
	public Collection<TaskDomain> getTasks() {
		return taskRepo.values();
	}
}
