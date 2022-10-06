public class Ghost extends People {
    private String name = "Ms. Havisham";
    private int age = 20;
    private String description = "A young, pale as all ghosts are, the \"wicked witch\" of the fairy tale.\n She's wearing a long, old wedding dress torn into parts. SHe was wearing only one shoe \nwith the silk stocking on it, once white, now yellow, had been trodden ragged.\n";

    public Ghost() {
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String kill() {
        return "You've been killed by the ghost. Quite expected, isn't it?";
    }

    public String tellBackground() {
        return "'Look at me! You are not afraid of a woman who has never seen the sun since \nyou were born? I was the only child of a rich country gentleman brewer, until my \ndad married a cook (how déclassé) and had another child, a son, who for some reason \ndecided he hated me and conspired with a conman named Compeyson to steal my fortune \nand then leave me at the altar on my wedding day. I remember that day vividly!\n It was 08:40 and I was at my dressing-table putting my shoes when I learned \nthat my to-be husband had left me! AH, THOSE MEN!'\n";
    }
}
