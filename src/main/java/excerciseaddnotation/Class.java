package excerciseaddnotation;

public class Class {

    private int age;
    private String name;
    private Person person;


    public Class() {
        this.age = 0;
        this.name = "";
        person = new Person(0,0);
    }

    public Class(int age, String name, Person person) {
        this.age = age;
        this.name = name;
        this.person = person;
    }

    @SuperMethod(run = true)
    public int nameLength(String s){

        return s.length();
    }

    @SuperMethod(run = false)
    public int heightSummary(Person person1, Person person2){

        return person1.getHeight() + person2.getHeight();
    }
}
