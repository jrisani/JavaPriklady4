import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class U01_premenne {
    public static void main(String[] args) {
        //Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5
        // a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
        // V Bratislave dňa 18.06.2022
        // Poznámka: Meno študenta, Dátum narodenia, známku a rok + aktuálny dátum nastavte tak,
        // aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).

        // skuska lamania textu asd asd v asdf v sasc casd asd as vsdf kl asalsk a sd a as ascasdav asf as fa v ascva sv casd v a sf cas d v as as c as dwesdf sfdds fsd fsdfsdfsd fsdfsdfsdf sdf sdfsdf

        String menoStudenta = "Jozef Mrkvička";
        String datumNarodenia = ("03.04.2000");
        double znamka = 1.5;
        String od = " septembra 2022";

        // naimportovanie triedy - ALT + ENTER - pre Date, SimpleDateFormat, LocalDate, Month

        //aktualny datum
        Date datum = new Date();  // Date je OBJEKT, ktora reprezentuje
        //slovensky format
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");


        System.out.println("Študent " +menoStudenta+ " sa narodil " + datumNarodenia+ ", z maturitnej skúšky má známku " +znamka+
                " a od" +od+ " nastúpi " + "do nového zamestnania ako Java programátor. ");
        System.out.println( "V Bratislave dňa " + formatDatumu.format(datum)+ ".");

        LocalDate localDate = LocalDate.of( 2014 , Month.FEBRUARY , 11 );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        System.out.println( "Vypisujem localDate: " + localDate.format(formatter));


        //TODO Vypiste znamku vo formate, ktory je akceptovatelny pre Slovaka, cize zobrazit desatinnu ciarku.
        //% je na číslo
        // 2f naformatuje na dve desatine miesta
        // %s - malé písmeno, %S - velké písmeno
        System.out.printf("Študent %s má známku %.1f", menoStudenta, znamka);
    }
}
