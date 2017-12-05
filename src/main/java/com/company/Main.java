package com.company;

import com.company.model.SimpleTripFactory;
import com.company.model.TripStore;
import com.company.model.entity.trip.Trip;
import java.sql.SQLException;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    TripStore store = new TripStore();
    try {
      List<Trip> list = store.loadTripsFromDB();
      System.out.println(list);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
