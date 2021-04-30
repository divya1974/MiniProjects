package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import entity.Product;
import entity.Transaction;
import entity.User;
import service.MainService;


public class MainClass {

	public static void main(String[] args) throws IOException {
		
	
		
		System.out.println("Java Application Main");

		while(true) {
		  BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Type for the following:"+'\n'+ "1 to Add User"+'\n'+"2 to Add product"+'\n' + "3 to Buy product"+'\n'+ "4 to Return a product"+'\n' + "5 to Blacklist a user"+'\n'+ "6 to get the best selling product"+'\n');
		  String option = reader.readLine();
		  
		  MainService mainservice =new MainService();
			
		 
		  if(option.equals("1")) 
			  {
			  System.out.println("Type in User Details:");
			  
			  System.out.println("Type User Name:");
			  String name = reader.readLine();
			  
			  User user=new User(name);
			  
			  mainservice.AddUser(user);  
		
		  }
		  if(option.equals("2")) 
		  {
		  System.out.println("Type in Product Details:");
		  
		  System.out.println("Type Product Name:");
		  String name = reader.readLine();
		  
		  Product product=new Product(name);
		  
		  mainservice.AddProduct(product);  
	
	     }
	
		  if(option.equals("3")) 
		  {
		  System.out.println("Type in UserId:");
		  String uname = reader.readLine();
		  Integer Uid=Integer.parseInt(uname);
		  
		  System.out.println("Type in ProductId:");
		  String pname = reader.readLine();
		  Integer Pid=Integer.parseInt(pname);

		  Transaction transaction=new Transaction(Uid, Pid,"Purchased");
		  mainservice.PurchaseProduct(transaction);
		  }
		  
		  if(option.equals("4")) 
		  {
		  System.out.println("Type in UserId:");
		  String uname = reader.readLine();
		  Integer Uid=Integer.parseInt(uname);
		  
		  System.out.println("Type in TransactionId:");
		  String tname = reader.readLine();
		  Integer Tid=Integer.parseInt(tname);
		  mainservice.ReturnProduct(Uid,Tid);
		  
		  }
		  
		  if(option.equals("5")) 
		  {
		  System.out.println("Type in UserId:");
		  String uname = reader.readLine();
		  Integer Uid=Integer.parseInt(uname);
		  mainservice.BlacklistUser(Uid); 
		  }

		  if(option.equals("6")) 
		  {
		  mainservice.getBestProduct();
		  }
		
	
		
	}

}
}
