package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Course {
    private String courseName;
    private ObservableList<Student> enrolledStudents = FXCollections.observableArrayList();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public boolean enrollStudent(Student student){
        return  enrolledStudents.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ObservableList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
