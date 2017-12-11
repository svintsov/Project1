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
    InputLanguageControl languageControl = new InputLanguageControl();

    System.out.println(getLangInput(InputLanguageControl.NUMBER_OF_COMMANDS));
  }

  int getLangInput(int commandsCounter) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      choice = inputIntFromScanner(scanner, BundleKeys.INPUT_SELECT_LANG, view);
    } while (choice >= commandsCounter || choice < 0);
    return choice;
  }


  String inputStringFromScanner(Scanner scanner, String inputMessage, View view) {
    view.printMessage(inputMessage);
    while (!scanner.hasNextLine()) {
      view.printMessage("Incorrect! Try again.\n");
      view.printMessage(inputMessage);
      scanner.next();
    }
    return scanner.nextLine();
  }

  int inputIntFromScanner(Scanner scanner, String inputMessage, View view) {
    view.printMessage(inputMessage);
    while (!scanner.hasNextInt()) {
      view.printMessage("Incorrect! Try again.\n");
      view.printMessage(inputMessage);
      scanner.next();
    }
    return scanner.nextInt();
  }
}
