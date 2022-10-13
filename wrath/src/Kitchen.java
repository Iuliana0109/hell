public class Kitchen extends OtherRooms {
    private int tables = 2;
    private int chairs = 7;
    private int nrOfClocks = 1;
    //  private String time = "08:40";
    private String description = "It is spacious, and I dare say had once been handsome, but every \ndiscernible thing in it was covered with dust and mould, and dropping to pieces. The most \nprominent object is a long table with a tablecloth spread on it, as if a feast had been in \npreparation when the house and the clocks all stopped together. A cake of some kind is in the \nmiddle of this cloth; it is so heavily overhung with cobwebs that its form is quite undistinguishable;\nits seeming to grow, like a black fungus covered with spiders and other insects";

    public Kitchen() {
    }

    public String getDescription() {
        return this.description;
    }

    public int getTables() {
        return this.tables;
    }

    public int getChairs() {
        return this.chairs;
    }

    public int getNrOfClocks() {
        return this.nrOfClocks;
    }

    //public String getTime() {
    //    return this.time;
    //}
}
