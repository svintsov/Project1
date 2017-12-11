package com.company.model.entity;

public enum Food {
  SINGLE(10), DOUBLE(20), TRIPLE(30), ALLINCLUSIVE(40);

  private long price;

  Food(long price) {
    this.price = price;
  }

  public long getPrice() {
    return price;
  }
}
