package repository;

import java.util.HashMap;
import java.util.Map;

import entity.Product;
import entity.User;

public class UserRepository {
	
	private static HashMap<Integer, User> usercollection;
	
	public void AddUser(User User)
	{
		usercollection.put(User.getId(), User);
	}
	
	public User GetUserbyId(Integer Uid) {
		
		for(Map.Entry<Integer, User> entry :usercollection.entrySet())
		{
			Integer id=entry.getKey();
			if(id.equals(Uid))
				return entry.getValue();
		}
		return null;
	
	}

	public String GetAllUsers()
	{
		String s=" ";
		for(Map.Entry<Integer, User> entry :usercollection.entrySet())
		{
 		s=s+entry.getValue().toString()+"  ";
		}
		return s;
	}

	public void RemoveProductfromUserList(Integer pid, Integer uid) {
		
		for(Map.Entry<Integer, User> entry :usercollection.entrySet())
		{
			Integer id=entry.getKey();
			if(id.equals(uid))
			{
				entry.getValue().DeleteListUsers(pid);
			}
		}

			
	}



}
