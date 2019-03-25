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
}
