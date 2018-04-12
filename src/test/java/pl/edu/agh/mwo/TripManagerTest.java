package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	@Test
	public void addTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		assertEquals(0, tripmanager.getTrips().size());
		tripmanager.addTrip(trip);
		assertEquals(1, tripmanager.getTrips().size());
	}
	@Test
	public void removeTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		tripmanager.addTrip(trip);
		assertEquals(1, tripmanager.getTrips().size());
		tripmanager.removeTrip(trip);
		assertEquals(0, tripmanager.getTrips().size());

	}
//	
	@Test
	public void findTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		
		
		
	}
}
