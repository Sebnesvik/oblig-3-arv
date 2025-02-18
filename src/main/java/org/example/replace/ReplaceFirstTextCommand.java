package org.example.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand{

  /**
   * Constructor
   * @param target
   * @param replacement
   */

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    return text.replaceFirst(super.getTarget(), super.getReplacement());
  }
}
