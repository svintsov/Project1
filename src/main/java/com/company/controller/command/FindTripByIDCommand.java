package com.company.controller.command;

import com.company.controller.Controller;
import com.company.model.TripStore;
import com.company.view.BundleKeys;
import com.company.view.View;
import java.util.Scanner;

public class FindTripByIDCommand implements Command {

  private TripStore tripStore;
  private int id;
  private View view;

  public FindTripByIDCommand(TripStore tripStore, View view) {
    this.tripStore = tripStore;
    this.view = view;
  }

  public void onChangedId(int id) {
    this.id = id;
  }

  @Override
  public void execute() {
    Scanner scanner = new Scanner(System.in);
    int id = Controller.inputIntFromScanner(scanner, BundleKeys.INPUT_ENTER_ID, view);
    view.printTrip(tripStore.getTripById(id));
  }
}
