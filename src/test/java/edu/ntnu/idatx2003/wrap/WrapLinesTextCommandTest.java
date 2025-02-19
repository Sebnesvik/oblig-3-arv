package edu.ntnu.idatx2003.wrap;

import edu.ntnu.idatx2003.wrap.WrapLinesTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

  @Test
  void testWrapTextWithSingleLine() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");
    String result = command.execute("Hello");
    assertEquals("<p>Hello</p>", result);

  }

  @Test
  void testWrapLineWithMultipleLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");
    String result = command.execute("Hello World\nHello World");
    assertEquals("<p>Hello World</p>\n<p>Hello World</p>", result);
  }

  @Test
  void testWrapTextWithEmptyString() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");
    String result = command.execute("");
    assertEquals("", result);
  }

  @Test
  void testWrapTextWithNullText() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");
    String result = command.execute(null);
    assertNull(result);
  }
}