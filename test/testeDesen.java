import org.junit.Test;
import ro.mycode.classes.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testeDesen {

    @Test
    public void test1() {

        ArrayList<Figura> desene = new ArrayList<>();
        Punct p1 = new Punct(1, 2);
        Punct p2 = new Punct(3, 4);

        Linie l1 = new Linie(p1, p2);
        Linie l2 = new Linie(p2, p2);

        Cerc c1 = new Cerc(p1, 2);
        Cerc c2 = new Cerc(p2, 3);

        Dreptunghi d1 = new Dreptunghi(p1, p2);
        Dreptunghi d2 = new Dreptunghi(p2, p1);

//        Eticheta e1 = new Eticheta("text1", p1, p2);
//        Eticheta e2 = new Eticheta("text", p2, p1);

        desene.add(p1);
       // desene.add(p2);
        desene.add(l1);
       // desene.add(l2);
        desene.add(c1);
       // desene.add(c2);
        desene.add(d1);
      //  desene.add(d2);
       // desene.add(e1);
       // desene.add(e2);

        System.out.println("Afisarea DESENELOR:");
        for (Figura f1 : desene) {
            System.out.println(f1.toString());
        }


        Punct translatare=new Punct(20,25);
        for(Figura f:desene){
            f.translatare(translatare);
        }

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Pct translatate:");
        for(Figura f:desene){
            System.out.println(f.toString());
        }

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("DUPLICARE");

       ArrayList<Figura>figuraDuplicata=new ArrayList<>();
       for(Figura figura: desene){
           figuraDuplicata.add(figura.duplicare());

       }

        System.out.println("Duplicarea desenului:  ");
       for(Figura figura: figuraDuplicata){
           figura.afiseaza();
       }

    }


    }



