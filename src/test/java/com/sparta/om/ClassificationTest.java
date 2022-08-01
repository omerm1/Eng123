package com.sparta.om;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClassificationTest {
    @Test
    @DisplayName("Given age is 21, return All films are available")
    void givenAgeIs21ReturnAllFilmsAreAvailable() {
        int time = 21;
        String expected = "All films are available.";
        String answer = FilmClassifications.availableClassifications(21);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given age is 14, return U, PG, 12 & 15 films are available.")
    void givenAgeIs14ReturnUPG1215FilmsAreAvailable() {
        int time = 14;
        String expected = "U, PG, 12 & 15 films are available.";
        String answer = FilmClassifications.availableClassifications(14);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given age is 7, return U, PG & 12 films are available.")
    void givenAgeIs7ReturnUPG12FilmsAreAvailable() {
        int time = 7;
        String expected = "U, PG & 12 films are available.";
        String answer = FilmClassifications.availableClassifications(7);
        Assertions.assertEquals(expected, answer);
    }
}
