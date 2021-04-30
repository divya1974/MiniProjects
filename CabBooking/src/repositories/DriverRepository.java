package repositories;

import java.util.HashMap;
import java.util.Map;

import entities.Driver;
import entities.Trip;

public class DriverRepository {
	
	static public HashMap<Integer,Driver> drivercollection=new HashMap<Integer, Driver>();
public void AddDriver(Driver driver)
{
	drivercollection.put(driver.getDriverId(),driver);
	
}

public HashMap<Integer, Driver> GetAllDrivers()
{
	return drivercollection;
	
}


public HashMap<Integer, Driver> GetDriversbyFromTo(String s, String d)
{
	
	HashMap<Integer, Driver> DriverList=new HashMap<>();
	 for (Map.Entry<Integer, Driver> entry :drivercollection.entrySet()) 
	 {
		 Driver driver=entry.getValue();
	 
		if((s.equals(driver.getSource())) && (d.equals(driver.getDestination())))
		{
			DriverList.put(driver.getDriverId(), driver);
		}
		
	 }
	return DriverList;			
}

}
