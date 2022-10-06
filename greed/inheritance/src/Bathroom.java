public class Bathroom extends OtherRooms {
    private String description = "It's a dark and equally empty bathroom, clearly not used for a long time";
    private int nrOfSpiders = 7;

    public Bathroom() {
    }

    public String getDescription() {
        return this.description;
    }

    public int getNrOfSpiders() {
        return this.nrOfSpiders;
    }

    public String useSink() {
        return "There is no water pouring. Why would you even try to wash your hands in a haunted house in the first place?";
    }
}
