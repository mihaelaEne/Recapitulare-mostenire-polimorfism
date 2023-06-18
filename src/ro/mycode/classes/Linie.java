package ro.mycode.classes;

import java.util.Objects;

public class Linie extends Figura {

    private Punct p1;
    private Punct p2;

    public Linie(int x, int y) {
    }

    public Linie(Punct p1, Punct p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punct getP1() {
        return p1;
    }

    public void setP1(Punct p1) {
        this.p1 = p1;
    }

    public Punct getP2() {
        return p2;
    }

    public void setP2(Punct p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        String text="";
        text+="Eu sunt o linie cu urmatoarele caracteristici:"+"\n";
        text+="punct de start: "+this.p1.getX()+"\n";
        text+="pct de stop: "+this.p2+"\n";
        return text;

    }

    @Override
    public void afiseaza(){
        System.out.println(this);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Linie)) return false;
        Linie linie = (Linie) o;
        return p1.equals(linie.p1) && p2.equals(linie.p2);
    }


}
