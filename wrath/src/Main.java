import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person person = new Person();
        Scanner name = new Scanner(System.in);
        System.out.println("Tell us your name: ");
        person.setName(name.nextLine());
        Scanner gender = new Scanner(System.in);
        System.out.println("Tell us your gender: ");
        person.setGender(gender.nextLine());
        Scanner age = new Scanner(System.in);
        System.out.println("Tell us your age: ");
        person.setAge(age.nextLine());
        System.out.println("Hi, " + person.getName() + "!");
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter the haunted house? \n1. Yes \n2. No\n");
        switch (input.nextLine()) {
            case "1":
                String choice1 = "2";
                while( choice1 != "1") {
                    System.out.println("You are in the hall now. In witch room would you like to enter? \n1. Bedroom 1 \n2. Bedroom 2\n3. Bedroom 3\n4. Kitchen\n5. Living Room\n6. Bathroom\n7. Exit the house\n");
                    Scanner input2 = new Scanner(System.in);
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
                            System.exit(0);
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
                            System.out.println("You made a wise choice. Bye...");
                            System.exit(0);
                    }
                }

                return;
            case "2":
                System.out.println("You made a wise choice. Bye...");
        }

    }
}