package com.company.model.entity.trip;

import com.company.model.entity.Order;

public abstract class Trip {

  private int id;
  private Order order;
  private long cost;

  public Trip(Order order) {
    this.order = order;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public long getCost() {
    return cost;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setCost(long cost) {
    this.cost = cost;
  }

  public int getId() {
    return id;
  }

  abstract long generatePriceFromAttributes();

  @Override
  public String toString() {
    return "Trip{" +
        "id=" + id +
        ", order=" + order +
        ", cost=" + cost +
        '}';
  }
}
