public class Bedroom2 extends Bedroom {

    @Override
    public String nrOfClocks() {
        return "1";
    }

    @Override
    public String description() {
        return "It is a large and disordered room with a huge untidy bed and a big dressing-table. The room seem once cozy and definitely belonged to a woman.";
    }

    public String lookAtTheDressingTable() {
        return "The Dressing-table had a huge dusty mirror and a lot of jewelry all over the place.\n There was also a shoe upon it, once white, now yellow, had never been worn.";
    }

    @Override
    public String showTime() {
        return "08:40";
    }
}
