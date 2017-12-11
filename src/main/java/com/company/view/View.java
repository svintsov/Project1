package com.company.view;

import com.company.model.entity.trip.Trip;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class View {

  public static final String MESSAGES_BUNDLE_NAME = "messages";
  public static ResourceBundle bundle =
      ResourceBundle.getBundle(
          MESSAGES_BUNDLE_NAME,
          new Locale("ua"));  // Ukrainian
  //new Locale("en"));        // English

  public void printMessage(String message) {
    try {
      System.out.println(bundle.getString(message));
    } catch (MissingResourceException MRE) {
      System.out.println(message);
    }
  }

  public void printTripList(List<Trip> list) {
    for (Trip trip : list) {
      System.out.println(trip);
    }
  }

}
