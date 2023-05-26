import com.sun.source.tree.TypeCastTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Tile[][] Mars = new Tile[10][10];

    public static void printTable() {
        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                if (Mars[i][j].presents.size() == 0) {
                    System.out.print("[  ?  ]" + " ");
                } else {
                    System.out.print("[ ");
                    for (Human object : Mars[i][j].presents) {
                        System.out.print(object.name + " ");
                    }
                    System.out.print("]");
                }
            }
            System.out.println();
        }
    }

    public static void printteam(ArrayList<? extends Human> inarr) {
        for (Human colonist : inarr) {
            if (colonist.HP != 0) {
                System.out.println(colonist.name + ", " + colonist.age + " y/o " + colonist.HP + "/100 HP"+" "+colonist.Oxygen+"/100 O2");
            } else {
                System.out.println(colonist.name + " DEAD");
            }
        }
    }

    public static void main(String[] args) {
        int turnnumber = 1;
        System.out.println("Welcome to Mars Colonization!Please type START to start the game, or type HELP for a list of commands and tips.");
        Scanner scan = new Scanner(System.in);
        String variabileStart = scan.next();
        variabileStart = variabileStart.toUpperCase();
        if (variabileStart.equals("HELP")) {
            System.out.println("Your objective is to explore Mars.");
            System.out.println("Every turn, you can see your team and their status at the top.");
            System.out.println("You win if you explore the whole of Mars. You lose if your whole team dies.");
            System.out.println("Select a team member using the \"select\" command.");
            System.out.println("Once a team member is selected, use \"moveup\", \"movedown\",\"moveleft\" or \"moveright\" to move, Astronauts cannot move more than once in a turn.");
            System.out.println("Unexplored tiles are marked with ?, explore them by moving an Astronaut over them. Colonists are the best for exploring, as other roles have higher chances of being injured");
            System.out.println("Medics may heal other Astornauts using the \"heal\" command, Engineers may repair other Astronauts' equipment using the \"repair\" command");
            System.out.println("Once you are ready to proceed, use the \"NextTurn\" command to move on to the next turn");
            System.out.println("You can end the game at any time using the \"exit\" command");

        }
        while (!variabileStart.equals("START")) {
            System.out.println("Please type START to start the game");
            variabileStart = scan.next();
            variabileStart = variabileStart.toUpperCase();
        }

        System.out.println("Please choose how many engineers do you want: ");
        Scanner scan1 = new Scanner(System.in);
        int numberOfEngineers = scan.nextInt();
        while (numberOfEngineers <= 0) {
            System.out.println("Please introduce a number of engineers greater than 0");
            numberOfEngineers = scan.nextInt();
        }

        System.out.println("Please choose how many medics do you want: ");
        Scanner scan2 = new Scanner(System.in);
        int numberOfMedics = scan.nextInt();
        while (numberOfMedics <= 0) {
            System.out.println("Please introduce a number of medics greater than 0");
            numberOfMedics = scan.nextInt();
        }

        System.out.println("Please choose how many colonists do you want: ");
        Scanner scan3 = new Scanner(System.in);
        int numberOfColonists = scan.nextInt();
        while (numberOfColonists <= 0) {
            System.out.println("Please introduce a number of colonist greater than 0");
            numberOfColonists = scan.nextInt();
        }

        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                Mars[i][j] = new Tile(i, j);
            }
        }
        int numberOfAstronauts = numberOfColonists + numberOfMedics + numberOfEngineers;
        ArrayList<Human> Astronauts = new ArrayList<>(numberOfAstronauts);
        ArrayList<Engineer> engineers = new ArrayList<>(numberOfEngineers);
        ArrayList<Medic> medics = new ArrayList<>(numberOfMedics);
        ArrayList<Colonist> colonists = new ArrayList<>(numberOfColonists);

        for (int i = 0; i < numberOfEngineers; i++) {
            Engineer e1 = new Engineer((byte) 4, (byte) 4, Engineer.generateName(), Engineer.generateAge());
            System.out.println(e1.name + ", " + e1.age);
            engineers.add(e1);
            Astronauts.add(e1);
            Mars[4][4].presents.add(e1);
        }


        for (int i = 0; i < numberOfMedics; i++) {
            Medic m1 = new Medic((byte) 4, (byte) 4, Medic.generateName(), Medic.generateAge());
            System.out.println(m1.name + ", " + m1.age);
            medics.add(m1);
            Astronauts.add(m1);
            Mars[4][4].presents.add(m1);
        }

        for (int i = 0; i < numberOfColonists; i++) {
            Colonist c1 = new Colonist((byte) 4, (byte) 4, Colonist.generateName(), Colonist.generateAge());
            System.out.println(c1.name + ", " + c1.age);
            colonists.add(c1);
            Astronauts.add(c1);
            Mars[4][4].presents.add(c1);
        }

        printTable();
        Medic m1 = new Medic((byte) 2, (byte) 2, Medic.generateName(), Medic.generateAge());
        Colonist c1 = new Colonist((byte) 2, (byte) 3, Colonist.generateName(), Colonist.generateAge());
        Engineer e1 = new Engineer((byte) 1, (byte) 3, Engineer.generateName(), Engineer.generateAge());


        System.out.println("It's time to explore!");
        Human SelectedMember = null;

        boolean firstprint=true;
        while (true) {
            boolean gameover = false;
            while (true) {
                Scanner command = new Scanner(System.in);
                String commandText = scan.next();
                boolean oktocontinue = false;
                System.out.println("-------------------------------------------");
                System.out.println("TURN " + turnnumber);
                if(firstprint) {
                    System.out.println("Your team:");
                    System.out.println("Medics:");
                    printteam(medics);
                    System.out.println("Engineers:");
                    printteam(engineers);
                    System.out.println("Colonists:");
                    printteam(colonists);
                }
                if(firstprint) {
                    printTable();
                    firstprint=false;
                }


                switch (commandText.toLowerCase()) {
                    case "select" -> {
                        System.out.println("Select a team member.");
                        oktocontinue = false;
                        if (commandText.equalsIgnoreCase("Select")) {
                            String argument = command.next();
                            if (!argument.isEmpty()) {
                                for (Human astro : Astronauts) {
                                    if (astro.name.equals(argument)) {
                                        SelectedMember = astro;
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Invalid command. Please provide a name after 'select'.");
                            }
                            if (SelectedMember != null) {
                                System.out.println("Selected " + SelectedMember.name);
                            }else{
                                System.out.println("Can't find"+ argument);
                            }
                        }
                    }
                    case "nextturn" -> oktocontinue = true;
                    case "moveup" -> {
                        if (SelectedMember != null) {
                            Mars[SelectedMember.x][SelectedMember.y].presents.remove(SelectedMember);
                            SelectedMember.moveUp();
                            Mars[SelectedMember.x][SelectedMember.y].presents.add(SelectedMember);
                            System.out.println("Your team:");
                            System.out.println("Medics:");
                            printteam(medics);
                            System.out.println("Engineers:");
                            printteam(engineers);
                            System.out.println("Colonists:");
                            printteam(colonists);
                            printTable();

                        } else {
                            System.out.println("Select a team member first");
                        }
                    }
                    case "movedown" -> {
                        if (SelectedMember != null) {
                            Mars[SelectedMember.x][SelectedMember.y].presents.remove(SelectedMember);
                            SelectedMember.moveDown();
                            Mars[SelectedMember.x][SelectedMember.y].presents.add(SelectedMember);
                            System.out.println("Your team:");
                            System.out.println("Medics:");
                            printteam(medics);
                            System.out.println("Engineers:");
                            printteam(engineers);
                            System.out.println("Colonists:");
                            printteam(colonists);
                            printTable();

                        } else {
                            System.out.println("Select a team member first");
                        }
                    }
                    case "moveleft" -> {
                        if (SelectedMember != null) {
                            Mars[SelectedMember.x][SelectedMember.y].presents.remove(SelectedMember);
                            SelectedMember.moveLeft();
                            Mars[SelectedMember.x][SelectedMember.y].presents.add(SelectedMember);
                            System.out.println("Your team:");
                            System.out.println("Medics:");
                            printteam(medics);
                            System.out.println("Engineers:");
                            printteam(engineers);
                            System.out.println("Colonists:");
                            printteam(colonists);
                            printTable();

                        } else {
                            System.out.println("Select a team member first");
                        }
                    }
                    case "moveright" -> {
                        if (SelectedMember != null) {
                            Mars[SelectedMember.x][SelectedMember.y].presents.remove(SelectedMember);
                            SelectedMember.moveRight();
                            Mars[SelectedMember.x][SelectedMember.y].presents.add(SelectedMember);
                            System.out.println("Your team:");
                            System.out.println("Medics:");
                            printteam(medics);
                            System.out.println("Engineers:");
                            printteam(engineers);
                            System.out.println("Colonists:");
                            printteam(colonists);
                            printTable();
                        } else {
                            System.out.println("Select a team member first");
                        }
                    }
                    case "heal" -> oktocontinue = true;
                    case "repair" -> oktocontinue = true;
                    case "exit" -> {
                        oktocontinue = true;
                        gameover = true;
                    }
                    default -> {
                        System.out.println("Invalid command. Please try again.");
                        oktocontinue = false;
                    }
                }
                if (oktocontinue) {
                    turnnumber++;
                    break;
                }
            }
            if (gameover) {
                System.out.println("Exiting game...");
                break;
            }
        }
    }


}

