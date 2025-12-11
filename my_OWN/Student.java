package my_OWN;

public class Student {
    // TODO: add fields here

    // TODO: add constructor here

    // TODO: add getter for ID 

    // TODO: add toString method to display student info

    //Fields wat eac student as

    private String name;
    private String id;
    private String course;

    // 2. Constructor (how we create a new student)
    public Student(String name, String id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }
    // 3. Getter for ID (needed for search/delete)
    public String getId() {
        return id;
    }

     // 4. toString method (how we display student info)
    
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Course: " + course;
    }
}

 