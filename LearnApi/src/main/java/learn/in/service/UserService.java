package learn.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import learn.in.model.ResponseEntityBody;
import learn.in.model.UserDomain;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public  ResponseEntity<ResponseEntityBody> createUser(UserDomain userDomain) {
		userRepository.createUser(userDomain);
		ResponseEntityBody ResponseEntityBody = new ResponseEntityBody("User reated Successfully",userDomain);
		return new ResponseEntity<>(ResponseEntityBody,HttpStatus.OK);
		
	}
	
	public  ResponseEntity<ResponseEntityBody> updateUser(Integer userId, UserDomain userDomain) {
		userRepository.updateUser(userId, userDomain);
		ResponseEntityBody responseEntityBody = new ResponseEntityBody("User Updated Successfully",userDomain);
		return new ResponseEntity<>(responseEntityBody,HttpStatus.OK);
		
	}
	
	public  ResponseEntity<ResponseEntityBody> deleteUser(Integer userId) {
		userRepository.deleteUser(userId);
		ResponseEntityBody responseEntityBody = new ResponseEntityBody("User Deleted Successfully",null);
		return new ResponseEntity<>(responseEntityBody,HttpStatus.OK);
		
	}
	
	public  ResponseEntity<ResponseEntityBody> getUsers(){
		ResponseEntityBody responseEntityBody = new ResponseEntityBody("List of Users",userRepository.getUsers());
		return new ResponseEntity<>(responseEntityBody,HttpStatus.OK);
		
	}
	
	public ResponseEntity<ResponseEntityBody> getUser(Integer userId) {
		ResponseEntityBody responseEntityBody = new ResponseEntityBody("User Details",userRepository.getUser(userId));
		return new ResponseEntity<>(responseEntityBody,HttpStatus.OK);
		
	}

}
