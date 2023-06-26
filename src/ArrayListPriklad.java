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
    }
}
