import java.util.Scanner;
import java.util.regex.*;
public class Colonist extends Human{

    public Colonist(byte x,byte y,String name,int age)
    {
        this.x=x;
        this.y=y;
        this.name=name;
        this.age=age;
    }
    public void explore()
    {
        System.out.println("It's time to explore!You have to choose which area you want!");
        System.out.println("Area 1 it's called Demacia");
        System.out.println("Area 2 it's called Yonia");
        System.out.println("Area 3 it's called Noxus");
        System.out.println("Please type 1,2 or 3 to start exploring: ");
        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();
        switch(option)
        {
            case 1: HP= (byte) (HP-20);
                Oxygen=Oxygen-40;
                System.out.println("You've arrived in Demacia!Your oxygen level is runnig low.It's "+Oxygen);
                System.out.println("You need a doctor!");
                System.out.println("Your HP level is "+HP);
                if(x==2||y==2)
                {
                    System.out.println("Your treatment is almost here!");
                    HP=100;
                }
                else
                {
                    System.out.println("I'm sorry!You are DEAD!");
                    HP=0;
                }
                break;
            case 2:System.out.println("You've arrived in Yonia!");
                System.out.println("Pair with an enginner to complete the quest");
                System.out.println("Go to START and wait from the other player");
                setPosition();
                break;
            case 3:System.out.println("You've arrived in Noxus!");
                System.out.println("Move a position to the left");
                moveLeftPlayer();
                break;
            default: throw new IllegalArgumentException("Please retype your option!");
        }

    }
    public void setPosition()
    {
        this.x=4;
        this.y=4;
    }


    @Override
    public void moveUpPlayer() {
        if(x==2 &&y==3 &&HP==100)
        {
            System.out.println("You've arrived in the Alien Zone");
            System.out.println("Please try to take cover.Move to the right a position.Type this exact pattern to happen.");
            System.out.println("Pattern must contain only 5 letters or at least 4 digits.You can use de same letter five times if you want.");
            Scanner scan=new Scanner(System.in);
            String text=scan.next();
            String pattern="[a-z]{5}|[0-9]{4}";
            Pattern pt=Pattern.compile(pattern);
            Matcher mt=pt.matcher(text);
            boolean result=mt.matches();
            if(result==true)
            {
                System.out.println("You're safe!");
            }
            else
            {
                System.out.println("You're dead!");
            }
        }
    }

    @Override
    public void moveRightPlayer() {

        if(y != 9) {
            this.y= (byte) (this.y+2);
        } else throw new IllegalArgumentException("Movement cannot be posible!");

    }


    @Override
    public void moveDownPlayer() {
        if(x != 9) {
            this.x= (byte) (this.x+1);
        } else throw new IllegalArgumentException("Movement cannot be posible!");

    }

    @Override
    public void moveLeftPlayer() {
        if(x!=0)
        {
            this.x= (byte) (this.x+3);
        }
        else throw new IllegalArgumentException("Movement cannot be posibile!");

    }
}
