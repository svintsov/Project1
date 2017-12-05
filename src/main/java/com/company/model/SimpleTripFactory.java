package com.company.model;

import com.company.model.entity.trip.HealingTrip;
import com.company.model.entity.trip.Order;
import com.company.model.entity.trip.RelaxTrip;
import com.company.model.entity.trip.ShoppingTrip;
import com.company.model.entity.trip.TouristTrip;
import com.company.model.entity.trip.Trip;

public class SimpleTripFactory {

  public Trip createTrip(Order order) {
    Trip trip = null;
    if (order.getType().equals("Relax")) {
      trip = new RelaxTrip(order);
    } else if (order.getType().equals("Tourist")) {
      trip = new TouristTrip(order);
    } else if (order.getType().equals("Healing")) {
      trip = new HealingTrip(order);
    } else if (order.getType().equals("Shopping")) {
      trip = new ShoppingTrip(order);
    }
    return trip;
  }

}
