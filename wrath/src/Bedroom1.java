public class Bedroom1 extends Bedroom {
    private int nrOfChairs = 2;
    private int nrOfMirrors = 3;

    @Override
    public String nrOfClocks() {
        return "1";
    }

    @Override
    public String description() {
        return "It's a hideously dark-blue room with a rumpled bed and a broken mirror.\n The ripped curtains can't prevent the light from invading the whole space but there's nothing\n to look at. Peculiarly characterless, this room seemed to be designed for guests and not for the\n house tenants. The spiders love it though so you might as well make yourself comfortable.\n";
    }

    @Override
    public String showTime() {
        return "08:40";
    }

    public int getNrOfChairs() {
        return this.nrOfChairs;
    }

    public int getNrOfMirrors() {
        return this.nrOfMirrors;
    }
}

