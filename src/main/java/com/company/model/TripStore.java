package com.company.model;

import com.company.model.dao.DaoFactory;
import com.company.model.dao.TripDao;
import com.company.model.entity.Order;
import com.company.model.entity.trip.SimpleTripFactory;
import com.company.model.entity.trip.Trip;
import java.util.List;

public class TripStore {

  private static TripStore tripStore;
  SimpleTripFactory simpleTripFactory;
  private List<Trip> trips;

  public TripStore(SimpleTripFactory simpleTripFactory){
    this.simpleTripFactory = simpleTripFactory;
  }

  private TripStore() {
  }

  public static TripStore getInstance() {
    if (tripStore == null) {
      return new TripStore();
    } else {
      return tripStore;
    }

  }

  public Trip orderTrip(Order order){
    Trip trip;
    trip = simpleTripFactory.createTrip(order);

    return trip;
  }

  public List<Trip> getTrips() {
    DaoFactory factory = DaoFactory.getInstance();
    TripDao dao = factory.createTripDao();

    return dao.findAll();
  }

  public Trip getTripById(int id) {
    DaoFactory factory = DaoFactory.getInstance();
    TripDao dao = factory.createTripDao();

    return dao.findById(id);
  }

}
