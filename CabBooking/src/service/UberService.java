package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import entities.Driver;
import entities.Trip;
import entities.User;
import repositories.DriverRepository;
import repositories.TripRepository;
import repositories.UserRepository;

public class UberService {
	

	DriverRepository driverrepository=new DriverRepository();	
	UserRepository userrepository=new UserRepository();
	TripRepository triprepository=new TripRepository();

public void AddDriverService(Driver driver)
{
	driverrepository.AddDriver(driver);
}

public String GetAllDriversService()
{
	HashMap<Integer,Driver> DriverList=driverrepository.GetAllDrivers();
	String response=new String("");
	  for (Map.Entry<Integer, Driver> entry : DriverList.entrySet()) {
		  String driver;
		  Integer Driverkey=entry.getKey();
		  String dname=entry.getValue().getName();
		  String dsource= entry.getValue().getSource();
		  String ddest=entry.getValue().getDestination();
        driver="Driver Id: "+ Driverkey+"  "+"Driver name " + dname+ "  " +"Driver source " + dsource+ "  " +"Driver Destination " + ddest+ "  " +'\n';
        response=response+driver;
	  }
	return response;	
}

public void AddUserService(User user)
{
	userrepository.AddUser(user);
}

public String GetAllUsersService()
{
	HashMap<Integer,User> UserList= userrepository.GetAllUsers();
	String response=new String("");
	  for (Map.Entry<Integer, User> entry : UserList.entrySet()) {
		  String user;
		  Integer Userkey=entry.getKey();
		  String uname=entry.getValue().getName();
		  String usource= entry.getValue().getSource();
		  String udest=entry.getValue().getDestination();
        user="User Id: "+ Userkey+"  "+"User name " + uname+ "  " +"User source " + usource+ "  " +"User Destination " + udest+ "  " +'\n';
        response=response+user;
	  }
	return response;	
}
public User GetUserbyIdService(Integer UId)
{
	return userrepository.GetUserbyId(UId);
	
	
}

public String GetAllDriverbyFromToService(String s, String d)
{
	  HashMap<Integer, Driver> DriverList= driverrepository.GetDriversbyFromTo(s, d);
	  String response=null;
	  for (Map.Entry<Integer, Driver> entry : DriverList.entrySet()) {
		  String driver;
		  Integer Driverkey=entry.getKey();
		  String dname=entry.getValue().getName();
		  String dsource= entry.getValue().getSource();
		  String ddest=entry.getValue().getDestination();
        driver="Driver Id: "+ Driverkey+"  "+"Driver name " + dname+ "  " +"Driver source " + dsource+ "  " +"Driver Destination " + ddest+ "  " +'\n';
        response=response+driver;
	  }
	return response;  
}

public void AddTrip(Trip trip) {	
triprepository.AddTrip(trip);	
}

public String GetAlTripsbyUIdSevice(Integer UId) {
	
	HashMap<Integer,Trip> TripbyUid = triprepository.GetTripbyUId(UId);
	 String response=null;
	  for (Entry<Integer, Trip> entry :TripbyUid.entrySet()) {
		  String trips;
		  Integer Tid=entry.getKey();
		  String tdate=entry.getValue().getDate();
		  String tsource= entry.getValue().getFrom();
		  String tdest=entry.getValue().getTo();
		  Integer tDid=entry.getValue().getDId();
		  Integer tUid=entry.getValue().getUId();
       trips=" Trip Id: "+ Tid+"  "+"User Id " + tUid+ "  " +"Driver Id " + tDid+ "  " +"From " +tsource+ "  " +" To "+tdest+ " " +" Date " +tdate+" "+'\n';
       response=response+trips;
	  }
	
	return response;
}

public String GetAlTripsbyDIdSevice(Integer DId) {
	
	HashMap<Integer,Trip> TripbyDid = triprepository.GetTripbyDId(DId);
	 String response=null;
	  for (Entry<Integer, Trip> entry :TripbyDid.entrySet()) {
		  String trips;
		  Integer Tid=entry.getKey();
		  String tdate=entry.getValue().getDate();
		  String tsource= entry.getValue().getFrom();
		  String tdest=entry.getValue().getTo();
		  Integer tDid=entry.getValue().getDId();
		  Integer tUid=entry.getValue().getUId();
       trips=" Trip Id: "+ Tid+"  "+"User Id " + tUid+ "  " +"Driver Id" + tDid+ "  " +"From " +tsource+ "  " +" To "+tdest+ " " +" Date " +tdate+" "+'\n';
       response=response+trips;
	  }
	
	return response;
}


}