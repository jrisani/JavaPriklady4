package gui;

import javax.swing.*;
import java.awt.*;

public class Kalkulacka {
    public static void main(String[] args) {
        JFrame hlavneOkno = new JFrame("Kalkulacka v1.0");
        hlavneOkno.setMinimumSize(new Dimension(400,300));
        //TODO Ako nastavit maximalizovane okno automaticky po spusteni aplikacie
        hlavneOkno.setResizable(false); // Zakazali sme moznost zmeny velkosti okna
        hlavneOkno.setLocationRelativeTo(null); // Vycentrujeme okno, resp. JFrame voci obrazovke, aj horizontalne, aj vertikalne

        // Pokracujeme vytvaranim panela
        JPanel panel = new JPanel();
        panel.setLayout(null);  // Panel bude bez akehokolvek layout-u

        hlavneOkno.setContentPane(panel);  // Do okna, teda JFrame tymto sposobom pridavame panel

        // Pre korektne zobrazenie okna, cize JFrame pouzijeme tieto dva prikazy (vid nizsie)
        hlavneOkno.pack();
        hlavneOkno.setVisible(true);
    }
}
