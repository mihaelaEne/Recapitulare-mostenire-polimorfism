package ro.mycode.interfaces;

import ro.mycode.classes.Punct;

public interface  Figura {

    void afiseaza() ;

   void translatare(Punct p);


     Figura duplicare();
    String toString();

}
