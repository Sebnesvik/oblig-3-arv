package org.example.wrap;

/**
 * WrapLinesTextCommand class
 */

public class WrapLinesTextCommand extends WrapTextCommand {

  /**
   * Constructor
   * @param prefix
   * @param suffix
   */

public WrapLinesTextCommand(String prefix, String suffix) {
  super(prefix, suffix);
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
  String[] lines = text.split("\n");
  StringBuilder result = new StringBuilder();

  for (String line : lines) {
    result.append(super.execute(line)).append("\n");
  }
  return result.toString().stripTrailing();
}
}
