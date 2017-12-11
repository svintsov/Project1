package com.company.model.entity.trip;

import com.company.model.entity.Order;

public class ShoppingTrip extends Trip {

  private static final long TRIP_COEF = 30;

  public ShoppingTrip(Order order) {
    super(order);
  }

  @Override
  long generatePriceFromAttributes() {
    long foodPrice = getOrder().getFood().getPrice();
    long transportPrice = getOrder().getTransport().getPrice();
    return (TRIP_COEF + foodPrice + transportPrice) * getOrder().getDuration();
  }


}
