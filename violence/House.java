public class House extends SystemHH {
    protected String time = "08:40";
    public int getRandomChamber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

