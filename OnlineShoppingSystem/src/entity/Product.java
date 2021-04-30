package entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Product {

	private static int count=0;
	
	private int id;
	private String name;
	private List<Integer> ListUsers;
	
	public Product(String name) {
		super();
		this.id = ++count;
		this.name = name;
		ListUsers=new ArrayList();
	}
	
	public List<Integer> getListUsers() {
		return ListUsers;
	}
	
	public void DeleteListUsers(Integer UserId)
	{
		for(Integer i=0; i<ListUsers.size();i++)
		{
			if(ListUsers.get(i).equals(UserId))
			{
				ListUsers.remove(i);
			}
				
		}
	}
	public void setListUsers(Integer Uid) {
		ListUsers.add(Uid);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
