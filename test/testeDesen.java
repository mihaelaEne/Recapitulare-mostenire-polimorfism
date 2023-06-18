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
        Linie l2 = new Linie(p2.getX(), p2.getY());

        Cerc c1 = new Cerc(p1, 2);
        Cerc c2 = new Cerc(p2, 3);

        Dreptunghi d1 = new Dreptunghi(p1, p2);
        Dreptunghi d2 = new Dreptunghi(p2, p1);

        Eticheta e1 = new Eticheta("text1", p1, p2);
        Eticheta e2 = new Eticheta("text", p2, p1);

        desene.add(p1);
        desene.add(p2);
        desene.add(l1);
        desene.add(l2);
        desene.add(c1);
        desene.add(c2);
        desene.add(d1);
        desene.add(d2);
        desene.add(e1);
        desene.add(e2);


        for (Figura f1 : desene) {
            System.out.println(f1.toString());
        }


//        Figura figuraDuplicata = duplicareFigura(l1); // Duplicarea liniei
//
//        desene.add(p1);
//        desene.add(figuraDuplicata);
//
//
//        System.out.println("Desenul geometric actualizat:");
//        for (Figura element : desene) {
//            element.afiseaza();
//        }
//    }
//
//    public static Figura duplicareFigura(Figura element) {
//        if (element instanceof Punct) {
//            Punct punct = (Punct) element;
//            return new Punct(punct.getX(), punct.getY());
//        } else if (element instanceof Linie) {
//            Linie linie = (Linie) element;
//            return new Linie(linie.getP1(), linie.getP2());
//        } else if (element instanceof Cerc) {
//            Cerc cerc = (Cerc) element;
//            return new Cerc(cerc.getCentru(), cerc.getRaza());
//        } else if (element instanceof Dreptunghi) {
//            Dreptunghi dreptunghi = (Dreptunghi) element;
//            return new Dreptunghi(dreptunghi.getP1(), dreptunghi.getP2());
//        } else if (element instanceof Eticheta) {
//            Eticheta eticheta = (Eticheta) element;
//            return new Eticheta(eticheta.getP1(), eticheta.getP2(), eticheta.getText());
//        }
//
//        return null;
//    }


    }

}

