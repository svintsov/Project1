package com.company.model.entity.trip;

public abstract class Trip {

  private int id;
  private Order order;
  private long price;

  public Trip(int id, Order order) {
    this.id=id;
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

  public void setId(int id) {
    this.id = id;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public int getId() {
    return id;
  }
}
