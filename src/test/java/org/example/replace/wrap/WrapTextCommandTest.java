package org.example.replace.wrap;

import org.example.wrap.WrapTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapTextCommandTest {

  @Test
  void testWrapTextWithParagraphTags() {
    WrapTextCommand command = new WrapTextCommand("<p>", "</p>");
    String result = command.execute("Hello");
    assertEquals("<p>Hello</p>", result);

  }

  @Test
  void testWrapTextWithParagraphAsterisks() {
    WrapTextCommand command = new WrapTextCommand("*", "*");
    String result = command.execute("Hello");
    assertEquals("*Hello*", result);
  }

  @Test
  void testWrapTextWithEmptyString() {
    WrapTextCommand command = new WrapTextCommand("<p>", "</p>");
    String result = command.execute("");
    assertEquals("<p></p>", result);
  }

  @Test
  void testWrapTextWithNullText() {
    WrapTextCommand command = new WrapTextCommand("<p>", "</p>");
    String result = command.execute(null);
    assertNull(result);
  }

}