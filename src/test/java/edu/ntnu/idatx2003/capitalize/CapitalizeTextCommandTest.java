package edu.ntnu.idatx2003.capitalize;

import edu.ntnu.idatx2003.capitalize.CapitalizeTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

  @Test
  void testCapitalizeFirstLetter() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    assertEquals("Hello", command.execute("hello"));
  }

  @Test
  void testCapitalizeOfAlreadyCapitalized() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    assertEquals("Hello", command.execute("Hello"));
  }

  @Test
  void testCapitalizeFirstLetterOfEmptyString() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    assertEquals("", command.execute(""));
  }

  @Test
  void testCapitalizeFirstLetterOfNullString() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    assertNull(command.execute(null));
  }

  @Test
  void testCapitalizeFirstLetterOfSingleLetter() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    assertEquals("A", command.execute("a"));
  }

  @Test
  void testcapitalizeFirstLetterOfSpecialCharacter() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    assertEquals("!", command.execute("!"));
  }


}