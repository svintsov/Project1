package com.company.controller.command;

import com.company.model.TripStore;
import com.company.model.entity.trip.Trip;
import com.company.view.View;
import java.util.Comparator;
import java.util.List;

public class SortTripsByCostAndShowCommand implements Command {

  private TripStore tripStore;
  private View view;

  public SortTripsByCostAndShowCommand(TripStore tripStore, View view) {
    this.tripStore = tripStore;
    this.view = view;
  }

  @Override
  public void execute() {
    List<Trip> list = tripStore.getTrips();
    list.sort(Comparator.comparingLong(Trip::getId));
    view.printTripList(list);
  }
}
