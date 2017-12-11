package com.company.controller;

import com.company.controller.command.Command;
import com.company.controller.command.EmptyCommand;

public class InputLanguageControl {

  public static final int NUMBER_OF_COMMANDS = 2;
  Command[] commands;

  public InputLanguageControl() {
    commands = new Command[NUMBER_OF_COMMANDS];

    Command emptyCommand = new EmptyCommand();

    for (int i = 0; i < NUMBER_OF_COMMANDS; i++) {
      commands[i] = emptyCommand;
    }

  }

  public void setCommand(int slot, Command command) {
    commands[slot] = command;
  }

  public void onButtonPressed(int slot) {
    commands[slot].execute();
  }

}
