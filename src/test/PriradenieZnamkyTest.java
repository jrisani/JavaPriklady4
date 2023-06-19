package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ulohy.U0703_ZakladneMatematickeOperacieCezMetodyKonzolvyVstup;
import ulohy.U0704_ProgramNaPriradenieZnamky;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriradenieZnamkyTest {
    @Test
    @DisplayName("Testovanie hodnotenia")
    public void hodnot() {
        assertEquals(A, PriradenieZnamky.hodnot(92));

    }
}
