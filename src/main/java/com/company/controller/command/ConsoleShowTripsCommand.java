package com.company.controller.command;

import com.company.model.TripStore;
import com.company.view.View;
import java.sql.SQLException;

public class ConsoleShowTripsCommand implements Command {

  private TripStore tripStore;
  private View view;

  public ConsoleShowTripsCommand(TripStore tripStore, View view) {
    this.tripStore = tripStore;
    this.view = view;
  }

  @Override
  public void execute() {
    try {
      view.printTripList(tripStore.loadTripsFromDB());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
