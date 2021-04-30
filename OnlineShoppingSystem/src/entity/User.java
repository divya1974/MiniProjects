package entity;

import java.util.ArrayList;
import java.util.List;

public class User {

private static int count=0;
	
	private int id;
	private String name;
	private boolean blacklist;
	private List<Integer> ListProducts;
	public User(String name) {
		super();
		this.id = ++count;
		this.name = name;
		this.blacklist=false;
		ListProducts=new ArrayList();
	}
	
	public boolean isBlacklist() {
		return blacklist;
	}

	public void setBlacklist(boolean blacklist) {
		this.blacklist = blacklist;
	}


	public List<Integer> getListProducts() {
		return ListProducts;
	}

	public void setListProducts(Integer Pid) {
		ListProducts.add(Pid);
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

	public void DeleteListUsers(Integer pid) {
		
	for(Integer i=0;i<ListProducts.size();i++)
	{
		ListProducts.remove(i);
	}
		
	}
}
