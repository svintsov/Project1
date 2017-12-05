package com.company.model.entity.trip;

public abstract class Trip {

  private Order order;
  private long price;

  public Trip(Order order) {
    this.order = order;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public long getPrice() {
    return price;
  }
}
