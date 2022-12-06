import java.io.PrintStream;

public class View extends Controller {
    String lastm() {
        return "They made a wise choice. Bye...";
    }

    String stats() {
        return "Nr of people survived: " + (nrOfPersons - nrOfPeopleKilled) + "\nNr of people killed: " + nrOfPeopleKilled;
    }

    String bathroom() {
        Bathroom bathroom = new Bathroom();
        return " You can count up to " + bathroom.getNrOfSpiders() + "\n If you want to use the sink: " + bathroom.useSink() +
                "Nothing more to see here, let's go back to the hall.\n";
    }

    String bedroom3() {
        Bedroom3 bedroom3 = new Bedroom3();
        System.out.println(bedroom3.description());
        int var20 = Integer.parseInt(bedroom3.nrOfClocks());
        return "It has " + var20 + " clock. The time is " + bedroom3.showTime() + ".\n" + "Nothing more to see here, let's go back to the hall.\n";
    }

    String kitchen() {
        Kitchen kitchen = new Kitchen();
        System.out.println(kitchen.getDescription());
        PrintStream var10000 = System.out;
        int var20 = kitchen.getChairs();
        return "It has " + var20 + " chairs, " + kitchen.getTables() + " tables and \n" + kitchen.getNrOfClocks() + " clock. The time is " + kitchen.time + ".\n" +
                "Nothing more to see here, let's go back to the hall.\n";
    }

    String bedroom2() {
        Bedroom2 bedroom2 = new Bedroom2();
        System.out.println(bedroom2.description());
        PrintStream var10000 = System.out;
        int var20 = Integer.parseInt(bedroom2.nrOfClocks());
        var10000.println("It has " + var20 + " clock. The time is " + bedroom2.showTime() + ".\n" + bedroom2.lookAtTheDressingTable());
        Ghost ghost = new Ghost();
        var10000 = System.out;
        String var10001 = ghost.description();
        return "Suddenly, you see the ghost everyone has warn you about \n" + var10001 + "She has a message for you: \n" + ghost.tellBackground() + ghost.kill();
    }
}
