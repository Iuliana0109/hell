import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person persons[] = new Person[1000000000];
        int nrOfPeopleKilled = 0;
        int nrOfPeopleSurvived = 0;
        int nrOfPersons = 0;
        while (true) {
                persons[nrOfPersons] = new Person(nrOfPersons, Integer.toString(nrOfPersons));
                System.out.println(persons[nrOfPersons].getName() + ", a " + persons[nrOfPersons].getRandomGender(persons[nrOfPersons].gender) + " of age " + persons[nrOfPersons].getRandomAge(3, 19) + " entered the house.");

                            System.out.println(persons[nrOfPersons].getName() + " are in the hall now. In witch room would they like to enter?");
                            Scanner input2 = new Scanner(String.valueOf(persons[nrOfPersons].getRandomAge(1, 7)));
                            PrintStream var10000;
                            String var10001;
                            int var20;
                            switch (input2.nextLine()) {
                                case "1":
                                    Bedroom1 bedroom = new Bedroom1();
                                    System.out.println(bedroom.description());
                                    var10000 = System.out;
                                    var20 = bedroom.getNrOfMirrors();
                                    var10000.println("It has " + var20 + " mirrors, \n" + bedroom.getNrOfChairs() + " chairs and " + bedroom.nrOfClocks() + " clock. The time is " + bedroom.showTime() + ".\n");
                                    System.out.println("Nothing more to see here, let's go back to the hall.\n");
                                    break;
                                case "2":
                                    Bedroom2 bedroom2 = new Bedroom2();
                                    System.out.println(bedroom2.description());
                                    var10000 = System.out;
                                    var20 = Integer.parseInt(bedroom2.nrOfClocks());
                                    var10000.println("It has " + var20 + " clock. The time is " + bedroom2.showTime() + ".\n" + bedroom2.lookAtTheDressingTable());
                                    Ghost ghost = new Ghost();
                                    var10000 = System.out;
                                    var10001 = ghost.description();
                                    var10000.println("Suddenly, you see the ghost everyone has warn you about \n" + var10001 + "She has a message for you: \n" + ghost.tellBackground() + ghost.kill());
                                    nrOfPeopleKilled += 1;
                                    break;
                                case "3":
                                    Bedroom3 bedroom3 = new Bedroom3();
                                    System.out.println(bedroom3.description());
                                    var10000 = System.out;
                                    var20 = Integer.parseInt(bedroom3.nrOfClocks());
                                    var10000.println("It has " + var20 + " clock. The time is " + bedroom3.showTime() + ".\n");
                                    System.out.println("Nothing more to see here, let's go back to the hall.\n");
                                    break;
                                case "4":
                                    Kitchen kitchen = new Kitchen();
                                    System.out.println(kitchen.getDescription());
                                    var10000 = System.out;
                                    var20 = kitchen.getChairs();
                                    var10000.println("It has " + var20 + " chairs, " + kitchen.getTables() + " tables and \n" + kitchen.getNrOfClocks() + " clock. The time is " + kitchen.time + ".\n");
                                    System.out.println("Nothing more to see here, let's go back to the hall.\n");
                                    break;
                                case "5":
                                    LivingRoom livingRoom = new LivingRoom();
                                    var10000 = System.out;
                                    var20 = livingRoom.getNrOfClocks();
                                    var10000.println("You've entered the living room. It has " + var20 + " clocks. The time is " + livingRoom.getTime() + ".\nIt also has 2 portraits on the wall. \n" + livingRoom.seePortrait1() + livingRoom.seePortrait2());
                                    System.out.println("Nothing more to see here, let's go back to the hall.\n");
                                    break;
                                case "6":
                                    Bathroom bathroom = new Bathroom();
                                    var10000 = System.out;
                                    var10001 = bathroom.getDescription();
                                    var10000.println(var10001 + " You can count up to " + bathroom.getNrOfSpiders() + "\n If you want to use the sink: " + bathroom.useSink());
                                    System.out.println("Nothing more to see here, let's go back to the hall.\n");
                                    break;
                                case "7":
                                    System.out.println("They made a wise choice. Bye...");
                                    nrOfPeopleSurvived = nrOfPeopleSurvived + 1;
                                    break;
                            }
                System.out.println("Nr of people survived: " + (nrOfPersons - nrOfPeopleKilled));
                System.out.println("Nr of people killed: " + nrOfPeopleKilled);
                nrOfPersons = nrOfPersons + 1;

        }
    }}