import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Tile[][] Mars = new Tile[10][10];

    public static void main(String[] args) {

        System.out.println("Welcome to Mars Colonazation! Please type START to start the game!");
        Scanner scan = new Scanner(System.in);
        String variabileStart = scan.next();
        variabileStart = variabileStart.toUpperCase();
        while(!variabileStart.equals("START")) {
            System.out.println("Please type START to start the game");
            variabileStart = scan.next();
            variabileStart = variabileStart.toUpperCase();
        }
        System.out.println("Please choose how many engineers do you want: ");
        Scanner scan1 = new Scanner(System.in);
        int numberOfEngineers = scan.nextInt();
        while(numberOfEngineers <= 0) {
            System.out.println("Please introduce a number of engineers greater than 0");
            numberOfEngineers = scan.nextInt();
        }
        System.out.println("Please choose how many medics do you want: ");
        Scanner scan2 = new Scanner(System.in);
        int numberOfMedics = scan.nextInt();
        while(numberOfMedics <= 0) {
            System.out.println("Please introduce a number of medics greater than 0");
            numberOfMedics = scan.nextInt();
        }
        System.out.println("Please choose how many colonists do you want: ");
        Scanner scan3 = new Scanner(System.in);
        int numberOfColonists = scan.nextInt();
        while(numberOfColonists <= 0) {
            System.out.println("Please introduce a number of colonist greater than 0");
            numberOfColonists = scan.nextInt();
        }

        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                Mars[i][j] = new Tile(i, j);
            }
        }

        ArrayList<Engineer> engineers = new ArrayList<>(numberOfEngineers);
        ArrayList<Medic> medics = new ArrayList<>(numberOfMedics);
        ArrayList<Colonist> colonists = new ArrayList<>(numberOfColonists);

        for(int i = 0; i < numberOfEngineers; i++) {
            Engineer e1 = new Engineer((byte) 4, (byte) 4, Engineer.generateName());
            System.out.println(e1.name);
            engineers.add(e1);
            Mars[4][4].presents.add(e1);
        }

        for(int i = 0; i < numberOfMedics; i++) {
            Medic m1 = new Medic((byte) 4, (byte) 4, Medic.generateName());
            System.out.println(m1.name);
            medics.add(m1);
            Mars[4][4].presents.add(m1);
        }

        for(int i = 0; i < numberOfColonists; i++) {
            Colonist c1 = new Colonist((byte) 4, (byte) 4, Colonist.generateName());
            System.out.println(c1.name);
            colonists.add(c1);
            Mars[4][4].presents.add(c1);
        }


//        engineers.get(1).moveUp(engineers.get(1));
//        System.out.println(engineers.get(1).x);
//        System.out.println(engineers.get(1).y);
//
//        engineers.get(1).moveUp(engineers.get(1));
//        System.out.println(engineers.get(1).x);
//        System.out.println(engineers.get(1).y);
//
//        engineers.get(1).moveUp(engineers.get(1));
//        System.out.println(engineers.get(1).x);
//        System.out.println(engineers.get(1).y);

        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                System.out.print(Mars[i][j].presents);
            }
            System.out.println();
        }
    }

}