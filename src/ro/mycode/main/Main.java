package ro.mycode.main;

import ro.mycode.classes.*;
import ro.mycode.controller.Desen;
import ro.mycode.view.ViewDesen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Figura> figuras = new ArrayList<>();

        //todo:5 desene
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 4);

        Linie l1 = new Linie(p1, p2);

        Cerc c1 = new Cerc(p1, 2);

        Dreptunghi d1 = new Dreptunghi(p1, p2);
        Dreptunghi d2 = new Dreptunghi(p2, p1);

        Eticheta e1 = new Eticheta(p1,p2,"text1");
        Eticheta e2 = new Eticheta(p2,p1,"text2");

        figuras.add(l1);
        figuras.add(c1);
        figuras.add(d1);
        figuras.add(d2);
        figuras.add(e1);
        figuras.add(e2);



        ViewDesen viewDesen = new ViewDesen(new Desen(figuras));



    }
}