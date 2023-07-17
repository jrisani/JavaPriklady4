package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ulohy.U0703_ZakladneMatematickeOperacieCezMetodyKonzolvyVstup;
import ulohy.U0705_CiselnePriradenieKTextovejZnamke;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Trieda na testovanie základných matematických operácií")
public class ZakladneMatematickeOperacieCezMetodyTest {
    @Test
    @DisplayName("Testovanie sčítania")
    public void otestujScitanie() {
        assertEquals(10, U0703_ZakladneMatematickeOperacieCezMetodyKonzolvyVstup.scitaj(5,5));
        assertEquals(15, U0703_ZakladneMatematickeOperacieCezMetodyKonzolvyVstup.scitaj(10,5));

    }

}
