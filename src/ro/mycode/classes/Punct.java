package ro.mycode.classes;


import ro.mycode.interfaces.Figura;

public  class Punct implements Figura {
    private int x;
    private int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void afiseaza(){

        System.out.println(this);
    }

    @Override
    public String toString() {
        String text="";
        text+="Eu sunt o punct cu urmatoarele caracteristici:"+"\n";
        text+="X: "+this.x+"\n";
        text+="Y: "+this.y+"\n";
        return text;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punct punct = (Punct) o;
        return x == punct.x && y == punct.y;
    }

    @Override
    public void translatare(Punct p){
        x+=p.getX();
        y+=p.getY();
    }

    @Override
    public Figura duplicare(){
        return new Punct(this.x,this.y);
    }

}
