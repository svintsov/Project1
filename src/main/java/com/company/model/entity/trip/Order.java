package com.company.model.entity.trip;

import com.company.model.entity.Food;
import com.company.model.entity.Transport;

public class Order {

  private Transport transport;
  private Food food;
  private int duration;
  private String type;

  private Order() {

  }

  public static Builder builder() {
    return new Order().new Builder();
  }

  public class Builder {

    private Builder() {

    }

    public Builder setTransport(Transport transport) {
      Order.this.transport = transport;
      return this;
    }

    public Builder setFood(Food food) {
      Order.this.food = food;
      return this;
    }


    public Builder setDuration(int duration) {
      Order.this.duration = duration;
      return this;
    }

    public Builder setType(String type){
      Order.this.type = type;
      return  this;
    }

    public Order build() {
      return Order.this;
    }
  }

  public Transport getTransport() {
    return transport;
  }

  public void setTransport(Transport transport) {
    this.transport = transport;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }


  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Order{" +
        "transport=" + transport +
        ", food=" + food +
        ", duration=" + duration +
        ", type='" + type + '\'' +
        '}';
  }
}
