package edu.ntnu.idatx2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String selection;

  /**
   * Constructor
   * @param prefix
   * @param suffix
   * @param selection
   */

  public WrapSelectionTextCommand(String prefix, String suffix, String selection) {
    super(prefix, suffix);
    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    if (text == null || !text.contains(selection)) {
      return null;
    }
    return text.replace(selection, super.execute(selection));

  }


}


