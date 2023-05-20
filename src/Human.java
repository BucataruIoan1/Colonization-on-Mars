import java.util.Random;
public  abstract class Human  implements Movement{
    String name;
    int age;
    boolean  gender;
    //  private  String status;
    byte HP=100;

    byte x;
    byte y;
    int Oxygen=100;


    public void moveUp() {
        if(x != 0) {
            x--;
        } else throw new IllegalArgumentException("Movement cannot be posible");
    }

    @Override
    public void moveDown(Human h1) {
        if(h1.x != 9 ) {
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
    ;

    static final int[] ages={24,30,18,19,21,32,25,20,22,23};
    public static int generateAge()
    {
        Random random=new Random();
        int randomAge=ages[random.nextInt(ages.length)];
        return randomAge;
    }
    public static String generateName() {
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        return randomName;
    }


}
