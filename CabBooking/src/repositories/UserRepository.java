package repositories;

import java.util.HashMap;
import java.util.Map;

import entities.Driver;
import entities.Trip;
import entities.User;

public class UserRepository {


	static public HashMap<Integer,User> usercollection=new HashMap<Integer, User>();
public void AddUser(User user)
{
	usercollection.put(user.getUserId(),user);
	
}

public HashMap<Integer, User> GetAllUsers()
{
	return usercollection;
	
}

public  User GetUserbyId(Integer UId)
{
    	
		 for (Map.Entry<Integer, User> entry :usercollection.entrySet()) 
			 {
				 User user=entry.getValue();
			 
				if(UId.equals(user.getUserId()))
					return user;
						
			 }
		return null;
		
	}

	
}



