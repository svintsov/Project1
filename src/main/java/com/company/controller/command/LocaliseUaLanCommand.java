package com.company.controller.command;

import com.company.view.View;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaliseUaLanCommand implements Command {

  @Override
  public void execute() {
    View.bundle = ResourceBundle.getBundle(View.MESSAGES_BUNDLE_NAME, new Locale("ua"));
  }
}
