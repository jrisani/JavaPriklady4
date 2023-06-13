package sk.tmconsulting.pozdravy;
import sk.tmconsulting.pozdravy.anglicky.Hello;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        Hello.pozdravujem();
        Hallo.pozdravujem();
        Szia.pozdravujem();
        Ahoj.pozdravujem();
    }
}
