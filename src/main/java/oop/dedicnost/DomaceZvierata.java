package oop.dedicnost;

public class DomaceZvierata {
    public static void main(String[] args) {
        Pes dunco = new Pes();
        dunco.sajeMlieko();
        //dunco.jeDomace = true;
        System.out.println("Je domáce zviera?: " + dunco.jeDomace);

        Macka cica = new Macka();
        cica.sajeMlieko();
        System.out.println("Je domáce zviera?: " + cica.jeDomace);
    }
}
