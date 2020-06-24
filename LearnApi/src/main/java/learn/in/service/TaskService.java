package learn.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import learn.in.model.ResponseEntityBody;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	public  ResponseEntity<ResponseEntityBody> getTasks(){
		ResponseEntityBody responseEntityBody = new ResponseEntityBody("List of Tasks",taskRepository.getTasks());
		return new ResponseEntity<>(responseEntityBody,HttpStatus.OK);
		
	}
}
