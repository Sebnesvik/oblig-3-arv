package edu.ntnu.idatx2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String selection;

  /**
   * Constructor for WrapSelectionTextCommand.
   * @param prefix The prefix to wrap the text with.
   * @param suffix The suffix to wrap the text with.
   * @param selection The specific part of the text to wrap.
   */

  public WrapSelectionTextCommand(String prefix, String suffix, String selection) {
    super(prefix, suffix);
    this.selection = selection;
  }

  /**
   * Gets the selected text that will be wrapped.
   * @return The selection string.
   */

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    if (!text.contains(selection)) {
      return text;
    }
    return text.replace(selection, super.execute(selection));
  }
}
