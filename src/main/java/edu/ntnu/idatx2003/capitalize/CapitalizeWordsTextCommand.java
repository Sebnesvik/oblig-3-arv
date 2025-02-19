package edu.ntnu.idatx2003.capitalize;

import edu.ntnu.idatx2003.TextCommand;

/**
 * CapitalizeWordsTextCommand is a class that capitalizes the first letter of each word in a text.
 */

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

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
    String[] words = text.split("\\s+");
    StringBuilder sb = new StringBuilder();

    for (String word : words) {
      sb.append(super.execute(word)).append(" ");
    }

    return sb.toString().trim();
  }

}
