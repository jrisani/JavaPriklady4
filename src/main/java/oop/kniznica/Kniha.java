package oop.kniznica;

import java.io.Serializable;

public class Kniha implements Serializable {
    private String nazov;
    private String autor;
    private int rokyVydania;

    public Kniha(String nazov, String autor, int rovyVydania) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokyVydania = rovyVydania;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokyVydania() {
        return rokyVydania;
    }

    public void setRokyVydania(int rokyVydania) {
        this.rokyVydania = rokyVydania;
    }


    @Override
    public String toString() {
        return "Kniha{" +
                "nazov='" + nazov + '\'' +
                ", autor='" + autor + '\'' +
                ", rokyVydania=" + rokyVydania +
                '}';
    }
}
