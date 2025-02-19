package edu.ntnu.idatx2003.capitalize;

import edu.ntnu.idatx2003.TextCommand;

/**
 * CapitalizeTextCommand is a class that capitalizes the first letter of a text.
 */

public class CapitalizeTextCommand implements TextCommand {

  /**
   * Method to execute the command
   * @param text
   * @return
   */

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      return text;
    }
    if (text.length() == 1) {
      return text.toUpperCase();
    }
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}


