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
    @Override
    public void moveUpPlayer() {
        if(x!=7)
        {
            this.x= (byte) (this.x-2);
        }else throw new IllegalArgumentException("Movement cannot be posible");

    }

    @Override
    public void moveDownPlayer() {
        if(x != 9) {
            this.x= (byte) (this.x+1);
        } else throw new IllegalArgumentException("Movement cannot be posible");

    }

    @Override
    public void moveRightPlayer() {
        if(x!=4 &&HP>=50)
        {
            HP= (byte) (HP+20);
            this.x= (byte) (this.x+2);

        }else throw new IllegalArgumentException("Movement cannot be posible");

    }

    @Override
    public void moveLeftPlayer() {
        if(y!=4&&Oxygen>40)
        {
            this.Oxygen=this.Oxygen+30;
            this.y= (byte) (this.y-1);

        }else throw new IllegalArgumentException("Movement cannot be posible");
    }
}