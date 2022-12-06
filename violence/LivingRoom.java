public class LivingRoom extends ForSleeping {
    private int nrOfClocks = 3;
    private String time = "08:40";
    private int nrOfPortraits = 2;

    public LivingRoom() {
    }

    public int getNrOfClocks() {
        return this.nrOfClocks;
    }

    public String getTime() {
        return this.time;
    }

    public int getNrOfPortraits() {
        return this.nrOfPortraits;
    }

    public String seePortrait1() {
        return "The first portrait was a rough but entirely recognizable portrait of a beautiful young \nwoman framed by faded gold. It was so old that you could barely see the once affectionate\n charming yet shy smile of hers and the keen eyes seem rather unexpressive after God \nknows how many years of staying unadmired on the wall.\n";
    }

    public String seePortrait2() {
        return "The second one was a portrait of a young man with a polite and vacant smile. His deep-set\n black eyes were clearly shrewd and judgmental.\n";
    }
}
