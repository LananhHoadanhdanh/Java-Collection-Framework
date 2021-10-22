package person_manager_full.model;

public class Teacher extends Person{
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "personalId = " + getPersonalId() +
                ", name = " + getName() +
                ", age = " + getAge() +
                ", subject = '" + subject + '\'' +
                '}';
    }
}
