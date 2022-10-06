public class Person extends People {
    private String age;
    private String name;
    private String gender;

    public Person(){
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setAge(String newAge) {
        this.age = newAge;
    }

    public String getAge() {
        return this.age;
    }
}