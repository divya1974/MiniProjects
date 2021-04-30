package repositories;

import java.util.HashMap;
import java.util.Map;

import entities.Driver;
import entities.Trip;

public class TripRepository {
	
	static public HashMap<Integer,Trip> tripcollection=new HashMap<>();
	
	public void AddTrip(Trip trip)
	{
		tripcollection.put(trip.getTId(),trip);
	}
	
	public HashMap<Integer,Trip> GetTripbyUId (Integer UId)
	{
		HashMap<Integer,Trip> tripsList=new HashMap<>();
		
		 for (Map.Entry<Integer, Trip> entry :tripcollection.entrySet()) 
			 {
				 Trip trip=entry.getValue();
			 
				if(UId.equals(trip.getUId()))
				{
					tripsList.put(entry.getKey(), trip);
				}
					
			 }
		return tripsList;
		
	}

	public HashMap<Integer,Trip> GetTripbyDId (Integer DId)
	{
		HashMap<Integer,Trip> tripsList=new HashMap<>();
		
		 for (Map.Entry<Integer, Trip> entry :tripcollection.entrySet()) 
			 {
				 Trip trip=entry.getValue();
			 
				if(DId.equals(trip.getDId()))
				{
					tripsList.put(entry.getKey(), trip);
				}
					
			 }
		return tripsList;
		
	}
	

}
