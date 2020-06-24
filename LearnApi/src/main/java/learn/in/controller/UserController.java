package learn.in.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import learn.in.model.ResponseEntityBody;
import learn.in.model.UserDomain;
import learn.in.service.UserService;

@RestController
@RequestMapping("/usercontroller")
public class UserController {
	
	 private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@GetMapping(value="/getStatus")
	public ResponseEntity<ResponseEntityBody> getStatus(){
		logger.info("Running......");
		ResponseEntityBody responseEntityBody = new ResponseEntityBody("Running....",null);
		return new ResponseEntity<>(responseEntityBody,HttpStatus.OK);
	}
	
	@RequestMapping(value="/userInfo/{userId}",method = RequestMethod.GET)
	public ResponseEntity<ResponseEntityBody> getUserById(@PathVariable("userId")Integer  userId){
		logger.info("userId : userId{}",userId);
		return userService.getUser(userId);
	}

	@RequestMapping(value="/getUsers",method = RequestMethod.GET)
	public ResponseEntity<ResponseEntityBody> getUsers(){
		logger.info("get all Users");
		return userService.getUsers();
	}
	
	@RequestMapping(value="/createUser",method = RequestMethod.POST)
	public ResponseEntity<ResponseEntityBody> createUser(@Valid @RequestBody(required = true)UserDomain  userDomain){
		logger.info("create user Object : userDomain{}",userDomain);
		return userService.createUser(userDomain);
	}
	
	@RequestMapping(value="/updateUser/{userId}",method = RequestMethod.PUT)
	public ResponseEntity<ResponseEntityBody> updateUser(@PathVariable("userId")Integer  userId,@RequestBody(required = true)UserDomain  userDomain){
		logger.info("update userId and object : userId{},userDomain{}",userId,userDomain);
		return userService.createUser(userDomain);
	}
	
	@RequestMapping(value="/deleteUser/{userId}",method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEntityBody> deleteById(@PathVariable("userId")Integer  userId){
		logger.info("delete userId : userId{}",userId);
		return userService.deleteUser(userId);
	}

}
