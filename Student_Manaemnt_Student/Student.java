package Student_Manaemnt_Student;
public class Student {
    private String name;
    private int id;
    private String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Course: " + course;
    }
}
