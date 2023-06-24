package ro.mycode.controller;

import ro.mycode.classes.Figura;
import ro.mycode.classes.Punct;

import java.util.ArrayList;

public class Desen extends Figura {

    private ArrayList<Figura> desene;

    public Desen(ArrayList<Figura> figuras) {
        desene =figuras;

    }

    public void addFidura(Figura figura) {
        desene.add(figura);
    }

    @Override
    public void afiseaza() {
        for (Figura figura : desene) {

            System.out.println(figura.toString());
        }
    }

    @Override
    public void translatare(Punct p){
        for(Figura figura:desene){
            figura.translatare(p);
        }
    }


    @Override
    public Figura duplicare(){
        for(Figura figura:desene){
            figura.duplicare();
        }
        return new Figura();
    }

}
