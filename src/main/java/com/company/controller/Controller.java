package com.company.controller;

import com.company.view.BundleKeys;
import com.company.view.View;
import java.util.Scanner;

public class Controller {

  View view;

  public Controller(View view) {
    this.view = view;
  }

  public void processUser() {
    InputControlHolder inputControlHolder = new InputControlHolder(view);
    inputControlHolder.getLanguageControl().onButtonPressed(
        getOptionsInput(InputLanguageControl.NUMBER_OF_COMMANDS, BundleKeys.INPUT_SELECT_LANG));
    while (true) {
      inputControlHolder.getMainControl().onInputPressed(
          getOptionsInput(InputMainControl.NUMBER_OF_COMMANDS, BundleKeys.INPUT_MAIN_OPTIONS));
    }

  }

  int getOptionsInput(int commandsCounter, String inputMessage) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      choice = inputIntFromScanner(scanner, inputMessage, view);
    } while (choice >= commandsCounter || choice < 0);
    return choice;
  }


  public static String inputStringFromScanner(Scanner scanner, String inputMessage, View view) {
    view.printMessage(inputMessage);
    while (!scanner.hasNextLine()) {
      view.printMessage("Incorrect! Try again.\n");
      view.printMessage(inputMessage);
      scanner.next();
    }
    return scanner.nextLine();
  }

  public static int inputIntFromScanner(Scanner scanner, String inputMessage, View view) {
    view.printMessage(inputMessage);
    while (!scanner.hasNextInt()) {
      view.printMessage("Incorrect! Try again.\n");
      view.printMessage(inputMessage);
      scanner.next();
    }
    return scanner.nextInt();
  }
}
