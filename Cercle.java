public class Cercle {
    private float x;
    private float y;
    Cercle(){
    }
    Cercle(Cercle c){
        this.x=c.x;
        this.y=c.y;
    }
    Cercle(float xx, float yy)
    {
        this.x=xx;
        this.y=yy;
    }
 
    @Override
    public String toString(){
        return this.x + " " + this.y;
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
    public float GetX(){return this.x;}
    public void SetX(float value){this.x = value;}
    public float GetY(){return this.y;}
    public void SetY(float value){this.y = value;}
}
