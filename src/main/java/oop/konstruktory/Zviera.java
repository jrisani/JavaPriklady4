package oop.konstruktory;

public class Zviera {
    private String rasa;
    private String pohlavie;
    private int vek;

    public Zviera(String rasa, String pohlavie, int vek) {
        this.rasa = rasa;
        this.pohlavie = pohlavie;
        this.vek = vek;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    public double getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Informácie o zvierati: \nrasa: " + rasa + " \nPohlavie: " + pohlavie + " \nVek: " + vek;
}
}
