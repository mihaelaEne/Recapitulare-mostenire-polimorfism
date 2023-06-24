package ro.mycode.view;

import ro.mycode.classes.Figura;
import ro.mycode.classes.Punct;
import ro.mycode.controller.Desen;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewDesen {

    private Scanner scanner;
    private Desen desen;

    public ViewDesen(Desen desen){
        this.desen=desen;
        scanner=new Scanner(System.in);
        play();
    }


    public void meniu() {
        System.out.println("Buna ziua!");
        System.out.println("Apasa tasta 1 pentru a afisa figura");
        System.out.println("Apasa tasta 2 pentru a translata figura");
        System.out.println("Apasa tasta 3 pentru a duplica figura");
    }


    public void play(){
        int alegere=0;
        boolean running=true;


        while (running){
            meniu();
            alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1:
                    desen.afiseaza();
                    break;
                case 2:
                    System.out.println("Alege coordpnatele pentru punct: x si y");

                    System.out.println("x:");
                    int x=Integer.parseInt(scanner.nextLine());
                    System.out.println("y:");
                    int y=Integer.parseInt(scanner.nextLine());
                    Punct p=new Punct(x,y);

                    desen.translatare(p);

                    desen.afiseaza();
                    break;

                case 3:
                    desen.duplicare();
                    desen.afiseaza();
                    break;

                default:
                    System.out.println("Alegere incorecta");
                    break;
            }
        }

    }

}
