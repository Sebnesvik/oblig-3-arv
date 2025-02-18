package org.example.replace.replace;

import org.example.replace.ReplaceFirstTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

  /**
   * Test to replace a single occurrence of the target text.
   */

  @Test
  void testReplaceSingleOccurence() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("world", "Java");
    String result = command.execute("Hello world");
    assertEquals("Hello Java", result);

  }

  /**
   * Test to replace multiple occurrences of the target text.
   */

  @Test
  void testReplaceMultipleOccurences() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("world", "Java");
    String result = command.execute("Hello world, Hello world");
    assertEquals("Hello Java, Hello world", result);
  }

  /**
   * Test to replace when the target text is not found.
   */

  @Test
  void testReplaceNoTarget() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("world", "Java");
    String result = command.execute("Hello Java");
    assertEquals("Hello Java", result);
  }

  /**
   * Test to replace when the text is null.
   */

  @Test
  void testReplaceNullText() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("world", "Java");
    String result = command.execute(null);
    assertNull(result);
  }

}