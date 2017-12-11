package com.company.model.entity.trip;

import com.company.model.entity.Order;

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
