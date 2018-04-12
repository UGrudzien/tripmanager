package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {
	
	Collection<Trip> trips = new ArrayList<Trip>();

	public Collection<Trip> getTrips() {
		// TODO Auto-generated method stub
		return trips;
	}
	public void addTrip(Trip trip){
		trips.add(trip);
	}
	public void removeTrip(Trip trip) {
		// TODO Auto-generated method stub
		trips.remove(trip);
	}
	public Trip findTrip(String name) {
		// TODO Auto-generated method stub
		for (Trip trip: trips){
			if (trip.getName()==name){
				return trip;
			}
		}
		return null;
		
	}


}
