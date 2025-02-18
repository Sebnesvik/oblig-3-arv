package edu.ntnu.idatx2003.replace;

import edu.ntnu.idatx2003.TextCommand;

/**
 * Class for replacing text in a string.
 */

public class ReplaceTextCommand implements TextCommand {
  private final String target;
  private final String replacement;

  /**
   * Constructor for ReplaceTextCommand.
   * @param target
   * @param replacement
   */

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  /**
   * Getters for target.
   */

  public String getTarget() {
    return target;

  }

  /**
   * Getters for replacement.
   */

  public String getReplacement() {
    return replacement;

  }

  /**
   * Method to replace text in a string.
   * @param text
   * @return text with replaced text
   */

  @Override
  public String execute(String text) {
  if (text == null) {
    return null;
  }
  return text.replace(target, replacement);
  }

}
