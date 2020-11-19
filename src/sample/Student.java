package sample;

public class Student {
    private String name;
    private String hometown;
    private String studentID;

    public Student(String name, String hometown, String studentID) {
        this.name = name;
        this.hometown = hometown;
        this.studentID = studentID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "sample.Student{" +
                "name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
