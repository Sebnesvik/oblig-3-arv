package edu.ntnu.idatx2003;

import java.util.List;

public class Script {
  private final List<TextCommand> textCommands;

  public Script(List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }

  public String execute(String text) {
    for (TextCommand command : textCommands) {
      text = command.execute(text);

    }
    return text;
  }
}
