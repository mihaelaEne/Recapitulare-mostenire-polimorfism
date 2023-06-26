package ro.mycode.classes;



import java.util.Objects;

public class Dreptunghi extends Figura {
    private Punct p1;
    private Punct p2;


    public Dreptunghi(Punct p1, Punct p2) {
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
    public void afiseaza() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String text = "";
        text += "Eu sunt un dreptunghi cu urmatoarele caracteristici:" + "\n";
        text += "Dreapta verticala are coordonatele: " + this.p1.getX()+" si "+this.p1.getY()+ "\n";
        text += "Dreapta orizonatala are coordonatele: " + this.p2.getX()+ " si "+this.p2.getY()+"\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dreptunghi)) return false;
        Dreptunghi that = (Dreptunghi) o;
        return Objects.equals(p1, that.p1) && Objects.equals(p2, that.p2);
    }

    @Override
    public void translatare(Punct p){
       p1.translatare(p);
       p2.translatare(p);
    }

    @Override
    public Figura duplicare(){
        return new Dreptunghi(new Punct(this.p1.getX(),this.p2.getY()),new Punct(this.p2.getX(),this.p1.getY()));
    }



}
