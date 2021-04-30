package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import entities.Driver;
import entities.Trip;
import entities.User;
import repositories.DriverRepository;
import repositories.UserRepository;
import service.UberService;
import java.util.PriorityQueue;
public class MainClass {
	
	
	public static void main(String[] args) throws IOException
	{
		int a=1;
		System.out.println("Java Application Main"+a);
		

		while(true) {
		  BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Type for the following:"+'\n'+ "1 to Add Driver"+'\n'+"2 to Add user"+'\n' + "3 to Book Driver"+'\n'+ "4 to Fetch Trip Details by UId"+'\n'+ "5 to Fetch Trip Details by DId"+'\n');
		  String option = reader.readLine();
		  
		  UberService uberservice=new UberService();
		 
		 
		  if(option.equals("1")) 
			  {
			  System.out.println("Type in Driver Details:");
			  
			  System.out.println("Type Driver Name:");
			  String name = reader.readLine();
			  
			  System.out.println("Type Driver Source");
			  String source = reader.readLine();
			  
			  System.out.println("Type Driver Destination:");
			  String destination = reader.readLine();
			  
			  Driver driver=new Driver(name,source,destination);
			  uberservice.AddDriverService(driver);
			  System.out.println(uberservice.GetAllDriversService());
		
		  }
		
			  if(option.equals("2")) 
				  {
				  System.out.println("Type in User Details:");
				  
				  System.out.println("Type User Name:");
				  String name = reader.readLine();
				  
				  System.out.println("Type User Source");
				  String source = reader.readLine();
				  
				  System.out.println("Type User Destination:");
				  String destination = reader.readLine();
				  
				  User user =new User(name,source,destination);
				  uberservice.AddUserService(user);
				  System.out.println(uberservice.GetAllUsersService());
			
			  }
				  
				  if(option.equals("3")) 
					  {
					  System.out.println("Type in User Details:");
					  
					  System.out.println("UserId");
					  String UIdS = reader.readLine();
					  Integer UId=Integer.parseInt(UIdS);
					  User user =uberservice.GetUserbyIdService(UId);
					  String response =uberservice.GetAllDriverbyFromToService(user.getSource(), user.getDestination());
					  System.out.print(response);
					  
					  System.out.println("Choose Driver: Type DId to start a Trip");
					  System.out.println("DriverId");
					  String DIdS = reader.readLine();
					  Integer DId=Integer.parseInt(DIdS);
					  
					  System.out.println("Date");
					  String date = reader.readLine();
					 
					  
					  Trip trip=new Trip(user.getSource(),user.getDestination(),UId,DId,date);
					  uberservice.AddTrip(trip);				
		
				  }
					  if(option.equals("4")) {
						  System.out.println("UserId");
						  String UIdS = reader.readLine();
						  Integer UId=Integer.parseInt(UIdS);
						System.out.print(uberservice.GetAlTripsbyUIdSevice(UId));
					  }
					
					  
					  if(option.equals("5")) {
						  System.out.println("DriverId");
						  String DIdS = reader.readLine();
						  Integer DId=Integer.parseInt(DIdS);
						System.out.print(uberservice.GetAlTripsbyDIdSevice(DId));
					  }
					  
     	   	
		 }
}
}



