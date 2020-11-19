package sample;

import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static java.sql.DriverManager.getConnection;

public class DataConnection {
    Connection connection = null;
    Statement statement = null;
    String url;
    public ObservableList studentNames2;

    public DataConnection(String url) throws SQLException {
        this.url = url;
        connect(url);
    }


    public void connect(String url) throws SQLException {
        connection = getConnection(this.url);
    }

    //createStatement is a function from the SQL library
    public void makeStatement() throws SQLException {
        this.statement = connection.createStatement();
    }

    public ArrayList<String> studentNameQueryStatement() {
        ArrayList<String> studentNames = new ArrayList<String>();
        String sql = "SELECT studentName FROM Student;";
        ResultSet rs=null;
        System.out.println("Before try");
        try {
            System.out.println(" Making statement");
            //execution:
            makeStatement();
            System.out.println("Made statements");
            rs = statement.executeQuery(sql);
            while (rs != null && rs.next()) { //tilføjer alle navnene fra kolonnen til arrayet.
                System.out.println(" names found :");
                String name = rs.getString(1);
                System.out.println(name);
                studentNames.add(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Got an SQL exception here");
        }
        System.out.println(studentNames);
        return studentNames;
    }

   /*public ResultSet StationQuery() throws SQLException {
       String sql = "SELECT * FROM station";
       ResultSet rs = stmt.executeQuery(sql);

       if (rs == null) {
           System.out.println("No records retrieved");
       }
       while (rs != null && rs.next()) {
           String name = rs.getString(1);
           int tracks = rs.getInt(2);
           System.out.println(name + " " + tracks);

       }
       return rs;
   }*/


}
