import java.util.Scanner;
import java.util.SortedMap;

public class Engineer extends Human implements Movement {

    public Engineer(byte x, byte y, String name, int age) {

        this.x = x;
        this.y = y;
        this.name = name;
        this.age = age;
    }

    public void build() {
        System.out.println("You can choose which type of fortress you want to build");
        System.out.println("Please type 1 or 2");
        System.out.println("In one you can recover and raise your level of HP and in 2 you have food and you can fill your tank");
        Scanner scan = new Scanner(System.in);
        int variabileOption = scan.nextInt();
        if (variabileOption == 1) {
            HP = (byte) (HP + 20);
        } else {
            if (variabileOption == 2) {
                Oxygen = 100;
            } else {
                System.out.println("You are in danger!You only have 20 % of HP.");
                HP = 20;
            }
        }


    }

    public void repair() {
        System.out.println("The repairs are done");

    }


}
