import java.util.ArrayList;
public class ArrayListPriklad {
    public static void main(String[] args) {
        // Vytvor mi ArrayList, ktory bude obsahovat len Stringy ohladom aut// ArrayList je trieda, ktora obsahuje v sebe len objekty. T.j. nemohli by sme do nej ukladat int, double, boolean, char, ...// Kedze String je objekt, mozeme ho do ArrayListu vlozit
        ArrayList<String> auta = new ArrayList<>();
        // Pridaj do ArrayListu 3 auta
        auta.add("Ferrari");
        auta.add("Lamborghini");
        auta.add("Porsche");


        // Vypis vsetky auta, ktore sa nachadzaju v ArrayListe
        for (String auto : auta) {
            System.out.println(auto);
        }

        // Vypis kolko aut sa nachadza v ArrayListe
        System.out.println(auta.size());

        // Vymaz prvy prvok z ArrayListu
        auta.remove(0);

        // Vypis vsetky auta, ktore sa nachadzaju v ArrayListe
        for (String auto : auta) {
            System.out.println(auto);
        }
        // Vymaz vsetky prvky z ArrayListu
        auta.clear();

        // Vypis kolko aut sa nachadza v ArrayListe
        System.out.println(auta.size());

        // Ukazka ArrayList, ktory pracuje s celymi cislami
        ArrayList celeCisla = new ArrayList<>();
        celeCisla.add(1);
        celeCisla.add(8900);
        celeCisla.add(1876786768);

        ArrayList velmiVelkeCeleCisla = new ArrayList<>();

        velmiVelkeCeleCisla.add(12372893798908908l); // V pripade Long je potrebne k cislu pridat postfix l
        ArrayList znaky = new ArrayList<>();
        znaky.add('a');
        znaky.add('b');
        znaky.add('c');

        ArrayList desatinneCisla = new ArrayList<>();
        desatinneCisla.add(2.3);
        desatinneCisla.add(4.87987);
        desatinneCisla.add(565675675.8787);
        desatinneCisla.add(-1.0);
        desatinneCisla.add(-2.0);
        for (int i = 0; i < desatinneCisla.size(); i++)
        {System.out.println(desatinneCisla.get(i));
        }

        for(Object desatinneCislo:desatinneCisla) {
            System.out.println(desatinneCislo);
        }
    }

    // Vypise obsah ArrayList cez metoduvypisObsahArrayList(desatinneCisla);vypisObsahArrayList(znaky);vypisObsahArrayList(auta);vypisObsahArrayList(celeCisla);
}