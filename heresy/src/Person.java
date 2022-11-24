import java.util.Random;

public class Person extends People {

    public int id;
    public String name;
    public String getRandomGender;

    Person (int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    private String age;

    public String getName() {
        return "Person " + this.name;
    }
    
    public static String[] gender = {"girl", "boy"};

    public static String getRandomGender(String[] gender) {
        int rnd = new Random().nextInt(gender.length);
        return gender[rnd];
    }

    public int getRandomAge(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}