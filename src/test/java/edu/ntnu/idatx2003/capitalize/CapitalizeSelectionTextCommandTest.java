import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idatx2003.capitalize.CapitalizeSelectionTextCommand;
import org.junit.jupiter.api.Test;

class CapitalizeSelectionTextCommandTest {

  @Test
  void testCapitalizeSelection() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("world");
    assertEquals("hello World", command.execute("hello world"));

    command = new CapitalizeSelectionTextCommand("java");
    assertEquals("Java is fun", command.execute("java is fun"));

    command = new CapitalizeSelectionTextCommand("is");
    assertEquals("this Is a test", command.execute("this is a test"));
  }

  @Test
  void testSelectionAtEnd() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("great");
    assertEquals("coding is Great", command.execute("coding is great"));
  }

  @Test
  void testSelectionNotFound() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("planet");
    assertEquals("hello world", command.execute("hello world"));
  }

  @Test
  void testEmptyText() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("hello");
    assertEquals("", command.execute(""));
  }

  @Test
  void testNullText() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("hello");
    assertNull(command.execute(null));
  }

  @Test
  void testNullSelection() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand(null);
    assertEquals("hello world", command.execute("hello world"));
  }

  @Test
  void testMultipleOccurrences() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("is");
    assertEquals("this Is Is a test", command.execute("this is is a test"));
  }

  @Test
  void testNumbersAndSymbols() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("hello");
    assertEquals("123 Hello!", command.execute("123 hello!"));
  }
}
