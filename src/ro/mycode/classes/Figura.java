package ro.mycode.classes;

public  class Figura {
    public void afiseaza() {
        System.out.println(this);
    }

    public void translatare(Punct p){
        System.out.println(this);
    }

    public Figura duplicare(){
        return null;
    }
    @Override
    public String toString() {
        return "Figura{}";
    }


}
