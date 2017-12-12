package com.company.controller;

import com.company.controller.command.Command;
import com.company.controller.command.EmptyCommand;

public class InputMainControl {

  public static final int NUMBER_OF_COMMANDS = 4;
  private Command[] commands;

  public InputMainControl() {
    commands = new Command[NUMBER_OF_COMMANDS];

    Command emptyCommand = new EmptyCommand();

    for (int i = 0; i < NUMBER_OF_COMMANDS; i++) {
      commands[i] = emptyCommand;
    }
  }

  public void setCommand(int slot, Command command) {
    commands[slot] = command;
  }

  public void onInputPressed(int slot) {
    commands[slot].execute();
  }

}
