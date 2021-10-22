package person_manager_full.model;

public class Student extends Person {
    private int averageScore;

    public Student() {
    }

    public Student(String name, int age, int averageScore) {
        super(name, age);
        this.averageScore = averageScore;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student {" +
                "personalId = " + getPersonalId() +
                ", name = " + getName() +
                ", age = " + getAge() +
                ", averageScore = " + getAverageScore() +
                '}';
    }
}
