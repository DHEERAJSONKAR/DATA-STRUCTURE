interface drawable
{
    void draw();
}
class rectangle implements drawable
{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class circle implements drawable
{
    public void draw(){
        System.out.println("drawing circle");
    }
}
public class Hello
{
    public static void main(String args[]){
        drawable d=new rectangle();
        d.draw();
        drawable f=new circle();
        f.draw();
    }
}