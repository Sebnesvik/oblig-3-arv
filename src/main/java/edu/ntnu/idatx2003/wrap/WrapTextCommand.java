package edu.ntnu.idatx2003.wrap;

import edu.ntnu.idatx2003.TextCommand;

public class WrapTextCommand implements TextCommand {
  private final String prefix;
  private final String suffix;

  /**
   * Constructor for WrapTextCommand
   * @param prefix
   * @param suffix
   */

public WrapTextCommand (String prefix, String suffix) {
    this.prefix = prefix;
    this.suffix = suffix;
  }

  /**
   * Method to execute the command
   * @param text
   * @return
   */

  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    return prefix + text + suffix;
  }
}
