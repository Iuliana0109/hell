public class Bedroom1 extends ForSleeping {
    private String description = "It's a hideously dark-blue room with a rumpled bed and a broken mirror.\n The ripped curtains can't prevent the light from invading the whole space but there's nothing\n to look at. Peculiarly characterless, this room seemed to be designed for guests and not for the\n house tenants. The spiders love it though so you might as well make yourself comfortable.\n";
    private int nrOfChairs = 2;
    private int nrOfMirrors = 3;
    private int nrOfClocks = 1;
   // private String time = "08:40";

    public Bedroom1() {
    }

    public int getNrOfClocks() {
        return this.nrOfClocks;
    }

  //  public String getTime() {
  //      return this.time;
  //  }

    public int getNrOfChairs() {
        return this.nrOfChairs;
    }

    public int getNrOfMirrors() {
        return this.nrOfMirrors;
    }

    public String getDescription() {
        return this.description;
    }
}
