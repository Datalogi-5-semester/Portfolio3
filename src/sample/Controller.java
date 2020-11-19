package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {

      DataConnection datacon = null;



    public TableView studentTable;
    public TableColumn IDColumn;
    public TableColumn nameColumn;
    public TableColumn hometownColumn;
    public Label newStudentTitle;
    public Button addStudentButton;
    public Label nameLabel;
    public TextField nameTextfield;
    public Label homeTownLabel;
    public Label studentIDLabel;
    public TextField hometownTextfield;
    public TextField studentIDTextfield;
    public TableView courseTable;
    public TableColumn courseNameColumn;
    public TableColumn teacherColumn;
    public TableColumn averageColumn;

    public ComboBox selectTeacherComB;
    public ComboBox selectCourseComB;
    public Button addToCourseButton;
    public ComboBox chooseCourseComB;
    public ComboBox chooseStudentComB;
    public ComboBox selectStudentComB;

    public ObservableList<String> students;
    //= FXCollections.observableArrayList();
    public ObservableList<Course> courses = FXCollections.observableArrayList();

    public ObservableList<String> getStudentNames() {
        System.out.println(" Calling query for Names");
       ObservableList<String> names = FXCollections.observableArrayList(datacon.studentNameQueryStatement());
               //FXCollections.observableList(datacon.studentNameQueryStatement());
              // (ObservableList<String>) datacon.studentNameQueryStatement();
        //ArrayList <String> names = new ArrayList<>();
        //names.add("Jenna");
        System.out.println(" Making observable list");
        //ObservableList<String> studentNamesObs = FXCollections.observableList(names);
        return names;
    }



    /*public void addStudent(javafx.event.ActionEvent actionEvent) {
        Student student = new Student(nameTextfield.getText(), hometownTextfield.getText(), studentIDTextfield.getText());
        students.add(student);
    }*/

    public void addToCourse(javafx.event.ActionEvent actionEvent) {

    }

    public void initialize() {
        //studentTable.setItems(students);
        IDColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("studentID"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        hometownColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("hometown"));
        System.out.println(datacon.studentNames);
        //students= getStudentNames();
      //selectStudentComB.setItems(getStudentNames());


    }
    public void setModel (DataConnection datacon){
        this.datacon = datacon;
    }
}
