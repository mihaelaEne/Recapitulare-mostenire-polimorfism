package ro.mycode.classes;

import java.util.Objects;

public class Eticheta extends Figura{

    private String text;
    private Punct p1;
    private Punct p2;

    public Eticheta(String text, Punct p1, Punct p2) {
        this.text = text;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
    public void afiseaza(){
        System.out.println(this);
    }

    @Override
    public String toString() {

        String text="";
        text+="Eu sunt o eticheta cu urmatoarele caracteristici:"+"\n";
        text+="punct 1: "+this.p1 +"\n";
        text+="pct 2: "+this.p2 +"\n";
        text+="text: "+this.text+"\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eticheta)) return false;
        Eticheta eticheta = (Eticheta) o;
        return Objects.equals(text, eticheta.text) && Objects.equals(p1, eticheta.p1) && Objects.equals(p2, eticheta.p2);
    }


}
