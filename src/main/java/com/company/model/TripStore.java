package com.company.model;

import com.company.model.entity.trip.Order;
import com.company.model.entity.trip.Trip;

public class TripStore {

  SimpleTripFactory simpleTripFactory;

  public TripStore(SimpleTripFactory simpleTripFactory){
    this.simpleTripFactory = simpleTripFactory;
  }

  public Trip orderTrip(Order order){
    Trip trip;
    trip = simpleTripFactory.createTrip(order);

    return trip;
  }

}
