package ro.mycode.classes;

import java.util.Objects;

public class Eticheta extends Dreptunghi {

    private String text;

    public Eticheta(Punct p1, Punct p2, String text) {
        super(p1, p2);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {

        String text="";
        text+="Eu sunt o eticheta cu urmatoarele caracteristici:"+"\n";
        text+="punct 1: "+super.getP1().getX() +"\n";
        text+="pct 2: "+super.getP1().getY() +"\n";
        text+="text: "+this.text+"\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eticheta)) return false;
        if (!super.equals(o)) return false;
        Eticheta eticheta = (Eticheta) o;
        return Objects.equals(text, eticheta.text);
    }



    @Override
    public void translatare(Punct p){
       super.translatare(p);
    }
    @Override
    public Figura duplicare(){
        return new Eticheta(new Punct(this.getP1().getX(), this.getP1().getY()),new Punct(this.getP2().getX(), this.getP2().getY()),text);
    }




}
