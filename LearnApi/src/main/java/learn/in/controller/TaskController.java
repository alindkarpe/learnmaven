package learn.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import learn.in.model.ResponseEntityBody;
import learn.in.service.TaskService;

@RestController
@RequestMapping("/taskcontroller")
public class TaskController {
	
	 private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
		
		@Autowired
		private TaskService taskService;
		
		@RequestMapping(value="/getTasks",method = RequestMethod.GET)
		public ResponseEntity<ResponseEntityBody> getTasks(){
			logger.info("get all Tasks");
			return taskService.getTasks();
		}
}
