package ro.mycode.classes;

import java.util.Objects;

public class Cerc extends Figura{

    private Punct centru;
    private int raza;

    public Cerc(Punct punctCentru, int raza) {
        this.centru = punctCentru;
        this.raza = raza;
    }



    public Punct getCentru() {
        return centru;
    }

    public void setCentru(Punct centru) {
        this.centru = centru;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void afiseaza(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        String text="";
        text+="Eu sunt un cerc cu urmatoarele proprietati:"+"\n";
        text+="punct centru: "+this.centru +"\n";
        text+="raza: "+this.raza+"\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cerc)) return false;
        Cerc cerc = (Cerc) o;
        return raza == cerc.raza && Objects.equals(centru, cerc.centru);
    }


}
