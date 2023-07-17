package oop.dedicnost;

public class Cicavec {
    public void steka(){
        System.out.println("Hav hav");
    }

    protected boolean jeDomace = false;
    public void sajeMlieko() {
        System.out.println("Saje mlieko");

    }

    public void neprepisatelnaMetoda() {
        System.out.println("Tuto metodu nepojde prepisat v potomkovi!");
    }

    private void nededitelnaMetoda() {
        System.out.println("Nepojde ju dedit!");
    }

}
