package edu.ntnu.idatx2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
  private final String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  public String getSelection() {
    return selection;

  }

  @Override
  public String execute(String text) {
    if (text == null || selection == null || text.isEmpty()) {
      return text;
    }
    if (!text.contains(selection)) {
      return text;
    }
    return text.replaceAll(selection, super.execute(selection));
  }

}
