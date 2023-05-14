import java.util.Random;

public abstract class Human implements Movement {

    String name;
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

    static final String[] names = {"John", "Michael", "Bill", "Liam", "Emma", "Noah", "Oliver", "Peter", "Chris",
            "Charlotte", "Ethan", "Elizabeth", "Sofia", "Lucas", "James", "Grace", "Alexander", "Chloe", "Daniel",
            "Roxane", "Robert", "David", "Samuel", "Lilly", "Joseph", "Henry", "Ella", "Penelope", "Amelia", "Evelyn"};

    public static String generateName() {
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        return randomName;
    }
}
