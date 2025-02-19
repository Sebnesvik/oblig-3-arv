package edu.ntnu.idatx2003.replace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

  /**
   * Test to replace a single occurrence of the target text.
   */

  @Test
  void testReplaceSingleOccurence() {
    ReplaceTextCommand command = new ReplaceTextCommand("world", "Java");
    String result = command.execute("Hello world");
    assertEquals("Hello Java", result);

  }

  /**
   * Test to replace multiple occurrences of the target text.
   */

  @Test
  void testReplaceMultipleOccurences() {
    ReplaceTextCommand command = new ReplaceTextCommand("world", "Java");
    String result = command.execute("Hello world, Hello world");
    assertEquals("Hello Java, Hello Java", result);
  }

  /**
   * Test to replace when the target text is not found.
   */

  @Test
  void testReplaceNoTarget() {
    ReplaceTextCommand command = new ReplaceTextCommand("world", "Java");
    String result = command.execute("Hello Java");
    assertEquals("Hello Java", result);
  }

  /**
   * Test to replace when the text is null.
   */

  @Test
  void testReplaceNullText() {
    ReplaceTextCommand command = new ReplaceTextCommand("world", "Java");
    String result = command.execute(null);
    assertNull(result);
  }




}