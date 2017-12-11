package com.company.controller;

import com.company.controller.command.ConsoleShowTripsCommand;
import com.company.controller.command.ExitCommand;
import com.company.controller.command.LocaliseEngLanCommand;
import com.company.controller.command.LocaliseUaLanCommand;
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
        new ConsoleShowTripsCommand(new TripStore(), view));
    mainControl.setCommand(DisplayKeys.INPUT_MAIN_EXIT, new ExitCommand());
  }

  public InputLanguageControl getLanguageControl() {
    return languageControl;
  }

  public InputMainControl getMainControl() {
    return mainControl;
  }
}
