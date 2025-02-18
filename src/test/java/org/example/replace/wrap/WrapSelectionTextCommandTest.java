package org.example.replace.wrap;

import org.example.wrap.WrapSelectionTextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  @Test
  void testWrapSelectionInText() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "world");
    String result = command.execute("Hello world");
    assertEquals("Hello <p>world</p>", result);
  }

  @Test
  void testWrapSelectionWhenSelectionIsNotPresent() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "world");
    String result = command.execute("Hello Java");
    assertEquals("Hello Java", result);
  }

  @Test
  void testWrapSelectionWithEmptyString() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "world");
    String result = command.execute("");
    assertEquals("", result);
  }

}
