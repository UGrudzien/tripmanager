package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	@Test
	public void addTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		assertEquals(0, tripmanager.getTrips().size());
		tripmanager.add(trip);
		assertEquals(1, tripmanager.addTrip().size());
	}
	@Test
	public void removeTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		if (trip.removeTrip().size()<0){
			throw new ArithmeticException("The number of trips couldn't be less then 0");
		}
	}
	
	@Test
	public void findTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		assertEquals(0, tripmanager.getTrips().size());
		for (listTrip:tripmanager.getTrips()){
			if (trip!=listTrip){
				throw new findTripExeption ("We are sorry but trip do not exist");
			}
		}
	}
}
