public class Bedroom2 extends ForSleeping {
    private String description = "It is a large and disordered room with a huge untidy bed and a big dressing-table. The room seem once cozy and definitely belonged to a woman.";
    private int nrOfClocks = 1;
   // private String time = "08:40";

    public Bedroom2() {
    }

    public int getNrOfClocks() {
        return this.nrOfClocks;
    }

  //  public String getTime() {
  //      return this.time;
  //  }

    public String getDescription() {
        return this.description;
    }

    public String lookAtTheDressingTable() {
        return "The Dressing-table had a huge dusty mirror and a lot of jewelry all over the place.\n There was also a shoe upon it, once white, now yellow, had never been worn.";
    }
}