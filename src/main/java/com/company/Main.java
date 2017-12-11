package com.company;

import com.company.controller.Controller;
import com.company.view.View;

public class Main {

  public static void main(String[] args) {
    /*TripStore store = new TripStore();
    try {
      List<Trip> list = store.loadTripsFromDB();
      System.out.println(list);
    } catch (SQLException e) {
      e.printStackTrace();
    }*/
    View view = new View();
    Controller controller = new Controller(view);
    controller.processUser();
  }

}
