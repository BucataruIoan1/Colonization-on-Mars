public abstract class Human implements Movement{

    private String name;
    private int age;
    boolean gender;
    private String status;
    byte HP;
    byte x;
    byte y;

    @Override
    public void moveUp(Human h1) {
        if(h1.x != 0) {
            h1.x--;
        } else throw new IllegalArgumentException("Movement cannot be posible");
    }

    @Override
    public void moveDown(Human h1) {
        if(h1.x != 9) {
            h1.x++;
        } else throw new IllegalArgumentException("Movement cannot be posible");
    }

    @Override
    public void moveLeft(Human h1) {
        if(h1.y != 0) {
            h1.y--;
        } else throw new IllegalArgumentException("Movement cannot be posible");
    }

    @Override
    public void moveRight(Human h1) {
        if(h1.y != 9) {
            h1.y++;
        } else throw new IllegalArgumentException("Movement cannot be posible");
    }
}
