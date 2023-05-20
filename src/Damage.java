public class Damage extends Human {
    public Damage(){
        this.x=1;
        this.y=2;
    }
    public void moveUp() {
        if (x == 1 || x == 7 && y == 2 || y == 7) {
            System.out.println("You fell from a cliff!");
            HP = -100;
        }
        /*if (h1.x == 2 || h1.x == 7 && h1.y == 1 || h1.y == 4 || h1.y == 9) {
            System.out.println("You were infected by something!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -40;
        }
        if (h1.x == 2 || h1.x == 4 || h1.x == 6 || h1.x == 8 && h1.y == 2 || h1.y == 5 || h1.y == 8) {
            System.out.println("You broke your arm!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -20;
        }
        if (h1.x == 1 || h1.x == 6 || h1.x == 9 && h1.y == 4 || h1.y == 7) {
            System.out.println("Your suit has broken!");
            System.out.println("Have the engineer repair it or continue to explore!");
            Oxygen = -40;
        }
        if (h1.x == 1 || h1.x == 3 || h1.x == 5 || h1.x == 8 && h1.y == 1 || h1.y == 3 || h1.y == 6) {
            System.out.println("Your oxygen levels are dropping fast!");
            System.out.println("Have the engineer refill your tank or continue to explore!");
            Oxygen = -20;
        }*/
    }

    public void moveDown(Human h1) {
        if (h1.x == 1 || h1.x == 7 && h1.y == 2 || h1.y == 7) {
            System.out.println("You fell from a cliff!");
            HP = -100;
        }
        if (h1.x == 2 || h1.x == 7 && h1.y == 1 || h1.y == 4 || h1.y == 9) {
            System.out.println("You were infected by something!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -40;
        }
        if (h1.x == 2 || h1.x == 4 || h1.x == 6 || h1.x == 8 && h1.y == 2 || h1.y == 5 || h1.y == 8) {
            System.out.println("You broke your arm!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -20;
        }
        if (h1.x == 1 || h1.x == 6 || h1.x == 9 && h1.y == 4 || h1.y == 7) {
            System.out.println("Your suit has broken!");
            System.out.println("Have the engineer repair it or continue to explore!");
            Oxygen = -40;
        }
        if (h1.x == 1 || h1.x == 3 || h1.x == 5 || h1.x == 8 && h1.y == 1 || h1.y == 3 || h1.y == 6) {
            System.out.println("Your oxygen levels are dropping fast!");
            System.out.println("Have the engineer refill your tank or continue to explore!");
            Oxygen = -20;
        }
    }
    public void moveLeft(Human h1) {
        if (h1.x == 1 || h1.x == 7 && h1.y == 2 || h1.y == 7) {
            System.out.println("You fell from a cliff!");
            HP = -100;
        }
        if (h1.x == 2 || h1.x == 7 && h1.y == 1 || h1.y == 4 || h1.y == 9) {
            System.out.println("You were infected by something!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -40;
        }
        if (h1.x == 2 || h1.x == 4 || h1.x == 6 || h1.x == 8 && h1.y == 2 || h1.y == 5 || h1.y == 8) {
            System.out.println("You broke your arm!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -20;
        }
        if (h1.x == 1 || h1.x == 6 || h1.x == 9 && h1.y == 4 || h1.y == 7) {
            System.out.println("Your suit has broken!");
            System.out.println("Have the engineer repair it or continue to explore!");
            Oxygen = -40;
        }
        if (h1.x == 1 || h1.x == 3 || h1.x == 5 || h1.x == 8 && h1.y == 1 || h1.y == 3 || h1.y == 6) {
            System.out.println("Your oxygen levels are dropping fast!");
            System.out.println("Have the engineer refill your tank or continue to explore!");
            Oxygen = -20;
        }
    }
    public void moveRight() {
        if (x == 1 || x == 7 && y == 2 || y == 7) {
            System.out.println("You fell from a cliff!");
            HP = -100;
        }
        /*if (h1.x == 2 || h1.x == 7 && h1.y == 1 || h1.y == 4 || h1.y == 9) {
            System.out.println("You were infected by something!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -40;
        }
        if (h1.x == 2 || h1.x == 4 || h1.x == 6 || h1.x == 8 && h1.y == 2 || h1.y == 5 || h1.y == 8) {
            System.out.println("You broke your arm!");
            System.out.println("Have the medic heal you or continue to explore!");
            HP = -20;
        }
        if (h1.x == 1 || h1.x == 6 || h1.x == 9 && h1.y == 4 || h1.y == 7) {
            System.out.println("Your suit has broken!");
            System.out.println("Have the engineer repair it or continue to explore!");
            Oxygen = -40;
        }
        if (h1.x == 1 || h1.x == 3 || h1.x == 5 || h1.x == 8 && h1.y == 1 || h1.y == 3 || h1.y == 6) {
            System.out.println("Your oxygen levels are dropping fast!");
            System.out.println("Have the engineer refill your tank or continue to explore!");
            Oxygen = -20;
        }*/
    }
    @Override
    public void moveUpPlayer() {
        if(x!=0)
        {

        }else throw new IllegalArgumentException("Movement cannot be posible");

    }

    @Override
    public void moveDownPlayer() {
        if(x != 9) {
            x++;
        } else throw new IllegalArgumentException("Movement cannot be posible");

    }

    @Override
    public void moveRightPlayer() {
        if(x==0&&y==0)
        {
            this.x= (byte) (this.x+1);
            this.y= (byte) (this.y+1);
        }


    }

    @Override
    public void moveLeftPlayer() {
        if(x==y && x>2&&x<5)
        {
            this.x= (byte) (this.x-1);
        }

    }
}