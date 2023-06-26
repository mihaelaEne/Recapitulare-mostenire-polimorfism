package ro.mycode.classes;

public abstract class Figura {
    public abstract void afiseaza() ;

    public abstract void translatare(Punct p);


    public Figura duplicare(){
        return null;
    }
    @Override
    public String toString() {
        return "Figura{}";
    }

}
