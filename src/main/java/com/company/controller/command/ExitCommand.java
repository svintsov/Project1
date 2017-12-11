package com.company.controller.command;

public class ExitCommand implements Command {

  @Override
  public void execute() {
    System.exit(1);
  }
}
