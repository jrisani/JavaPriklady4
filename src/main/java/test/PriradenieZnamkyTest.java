package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriradenieZnamkyTest {
    @Test
    @DisplayName("Testovanie metody hodnoť")
    public void testHodnot() {
        assertEquals("A", PriradenieZnamky.hodnot(92));

    }
}
