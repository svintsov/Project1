package com.company.model;

import com.company.model.dao.DaoFactory;
import com.company.model.dao.TripDao;
import com.company.model.entity.trip.Order;
import com.company.model.entity.trip.Trip;
import java.sql.SQLException;
import java.util.List;

public class TripStore {

  SimpleTripFactory simpleTripFactory;

  public TripStore(SimpleTripFactory simpleTripFactory){
    this.simpleTripFactory = simpleTripFactory;
  }

  public TripStore(){
  }

  public Trip orderTrip(Order order){
    Trip trip;
    trip = simpleTripFactory.createTrip(order);

    return trip;
  }

  public List<Trip> loadTripsFromDB() throws SQLException{
    DaoFactory factory = DaoFactory.getInstance();
    TripDao dao = factory.createTripDao();

    return dao.findAll();
  }

}
