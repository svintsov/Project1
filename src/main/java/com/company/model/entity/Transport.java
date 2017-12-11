package com.company.model.entity;

public enum Transport {
  BUS(20), TRAIN(30), CAR(40), PLANE(50), SHIP(60);

  private long price;

  Transport(long price) {
    this.price = price;
  }

  public long getPrice() {
    return price;
  }
}
