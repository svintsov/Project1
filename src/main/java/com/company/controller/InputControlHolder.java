package com.company.controller;

import com.company.controller.command.ConsoleShowTripsCommand;
import com.company.controller.command.ExitCommand;
import com.company.controller.command.FindTripByIDCommand;
import com.company.controller.command.LocaliseEngLanCommand;
import com.company.controller.command.LocaliseUaLanCommand;
import com.company.controller.command.SortTripsByCostAndShowCommand;
import com.company.model.TripStore;
import com.company.view.View;

public class InputControlHolder {

  private InputLanguageControl languageControl;
  private InputMainControl mainControl;

  public InputControlHolder(View view) {
    languageControl = new InputLanguageControl();
    mainControl = new InputMainControl();

    languageControl.setCommand(DisplayKeys.INPUT_LANG_UA, new LocaliseUaLanCommand());
    languageControl.setCommand(DisplayKeys.INPUT_LANG_EN, new LocaliseEngLanCommand());

    mainControl.setCommand(DisplayKeys.INPUT_MAIN_LIST,
        new ConsoleShowTripsCommand(TripStore.getInstance(), view));
    mainControl.setCommand(DisplayKeys.INPUT_MAIN_EXIT, new ExitCommand());
    mainControl.setCommand(DisplayKeys.INPUT_MAIN_SORT_LIST,
        new SortTripsByCostAndShowCommand(TripStore.getInstance(), view));
    mainControl.setCommand(DisplayKeys.INPUT_MAIN_FIND_TRIP_BY_ID,
        new FindTripByIDCommand(TripStore.getInstance(), view));
  }

  public InputLanguageControl getLanguageControl() {
    return languageControl;
  }

  public InputMainControl getMainControl() {
    return mainControl;
  }
}
