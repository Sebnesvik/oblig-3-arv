package edu.ntnu.idatx2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
  private final String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    if (text == null || selection == null || text.isEmpty()) {
      return text;
    }
    if (!text.contains(selection)) {
      return text;
    }
    return text.replaceAll("\\b" + selection +  "\\b", super.execute(selection));
  }

}
