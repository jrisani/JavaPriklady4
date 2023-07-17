package temp;

public class SubstringPriklad {
    public static void main(String[] args) {
        String meno = "Samuel";
        System.out.println(meno.substring(4)); // Zobrazi test od pozicie znaku (indexu) 4, zacina 0-ou
        System.out.println(meno.substring(0)); // Zobrazi test od pozicie znaku (indexu) 0, takze cely text
        //System.out.println(meno.substring(7,9));  // Zobrazi posledne 2 znaky v texte
        System.out.println(meno.substring(meno.length()-2, meno.length())); // Univerzalne ziskanie poslednych 2 znakov
    }
}
