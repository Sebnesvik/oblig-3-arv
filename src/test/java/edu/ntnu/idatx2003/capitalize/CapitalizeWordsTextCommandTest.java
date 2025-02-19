package edu.ntnu.idatx2003.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  @Test
  void testCapitalizeFirstLetterOfMultipleWords() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("Hello World", command.execute("hello world"));
  }

  @Test
  void testCapitalizeFirstLetterOfAlreadyCapitalized() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("Hello World", command.execute("Hello World"));
  }

  @Test
  void testCapitalizeFirstLetterOfEmptyString() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("", command.execute(""));
  }

  @Test
  void testCapitalizeFirstLetterOfNullString() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertNull(command.execute(null));
  }

  @Test
  void testCapitalizeFirstLetterOfSingleWord() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("Hello", command.execute("hello"));
  }

  @Test
  void testCapitalizeFirstLetterOfSpecialCharacter() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("!", command.execute("!"));
  }



}