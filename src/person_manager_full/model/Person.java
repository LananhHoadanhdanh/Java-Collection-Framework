package person_manager_full.model;

public class Person {
    private String name;
    private int age;
    private int personalId;
    public static int id = 0;
    public static int maxId = 0;

    public Person() {
    }

    public Person(String name, int age) {
        this.personalId = id;
        this.name = name;
        this.age = age;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Person.id = id;
    }

    @Override
    public String toString() {
        return "Human {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}


