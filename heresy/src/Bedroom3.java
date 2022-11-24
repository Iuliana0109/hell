public class Bedroom3 extends Bedroom {
    @Override
    public String nrOfClocks() {
        return "1";
    }

    @Override
    public String description() {
        return "This room is empty and clearly not finished. It seems like\n it was in the process of being renewed. The room was designed for a baby so the \ntenants were probably waiting for one to come or planning it.";
    }

    @Override
    public String showTime() {
        return "08:40";
    }
}