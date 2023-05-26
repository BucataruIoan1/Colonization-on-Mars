import java.util.SortedMap;

public class Medic extends Human implements Movement{

    public Medic(byte x,byte y,String name,int age)
    {

        this.x=x;
        this.y=y;
        this.name=name;
        this.age=age;
    }
    public void setPosition()
    {
        this.x=5;
        this.y=5;
    }
    public void heal()
    {
        if(x==1 ||y==2 && x==3 ||x==7&&y==3)
        {
            System.out.println("Your role is to help the other players.Please see where are you need it ");
            System.out.println("Go the Medics Zone");
            setPosition();
        }

    }

}