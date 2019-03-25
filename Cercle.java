public class Cercle {
    private float x;
    private float y;
    Cercle(){
    }
    Cercle(Cercle c){
        x=c.x;
        y=c.y;
    }
    Cercle(float xx, float yy)
    {
        x=xx;
        y=yy;
    }
 
    @Override
    public String toString(){
        return x + " " + y;
    }

    @Override
    public boolean equals(Object o){
        return(this == o);
    }
    
    public static void main(String[] args){
        Cercle c1 = new Cercle(12, 5);
        Cercle c2 = new Cercle(10, 10);
        Cercle c3 = new Cercle(c1);
        c1.toString();
        c2.toString();
        if (c1.equals(c3))c3.toString();
    }
}
