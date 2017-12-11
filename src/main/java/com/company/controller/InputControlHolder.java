package com.company.controller;

import com.company.controller.command.LocaliseEngLanCommand;
import com.company.controller.command.LocaliseUaLanCommand;

public class InputControlHolder {

  private InputLanguageControl languageControl;
  private InputMainControl mainControl;

  public InputControlHolder() {
    languageControl = new InputLanguageControl();
    mainControl = new InputMainControl();

    languageControl.setCommand(DisplayKeys.INPUT_LANG_UA, new LocaliseUaLanCommand());
    languageControl.setCommand(DisplayKeys.INPUT_LANG_EN, new LocaliseEngLanCommand());
  }

  public InputLanguageControl getLanguageControl() {
    return languageControl;
  }

  public InputMainControl getMainControl() {
    return mainControl;
  }
}
