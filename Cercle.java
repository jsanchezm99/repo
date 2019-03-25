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
    public float GetX(){return this.x;}
    public void SetX(float value){this.x = value;}
    public float GetY(){return this.y;}
    public void SetY(float value){this.y = value;}
}
