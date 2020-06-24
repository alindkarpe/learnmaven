package learn.in.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import learn.in.model.UserDomain;

@Service
public class UserRepository{

	 private static Map<Integer, UserDomain> userRepo = new HashMap<>();
	 static {
		 UserDomain user1 = new UserDomain(1, "java", new Date(), true);
		 userRepo.put(user1.getUserId(), user1);
		 UserDomain user2 = new UserDomain(2, "maven", new Date(), true);
		 userRepo.put(user2.getUserId(), user2);
		 UserDomain user3 = new UserDomain(3, "swagger", new Date(), false);
		 userRepo.put(user3.getUserId(), user3);
	 }
	 
	 
	
	public int createUser(UserDomain userDomain) {
		int oldcount = userRepo.size();
		userRepo.put(userDomain.getUserId(), userDomain);
		return (userRepo.size() - oldcount);
	}

	
	public int updateUser(Integer userId, UserDomain userDomain) {
		userRepo.remove(userId);		
		int oldcount = userRepo.size();
		userRepo.put(userId,userDomain);
		return (userRepo.size() - oldcount);
	}

	
	public int deleteUser(Integer userId) {
		int oldcount = userRepo.size();
		userRepo.remove(userId);
		return (oldcount - userRepo.size());	
	}

	
	public Collection<UserDomain> getUsers() {
		return userRepo.values();
	}

	
	public UserDomain getUser(Integer userId) {
		return userRepo.get(userId);
	}

}
