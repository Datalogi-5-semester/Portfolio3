package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application {
    static String url = "jdbc:sqlite:C:\\Users\\User\\Documents\\Datalogi\\Portfolio3_database";


    @Override
    public void start(Stage primaryStage) throws IOException {
        Controller controller = new Controller();

        DataConnection dataConnection=null;

            try {
                dataConnection = new DataConnection(url);
                controller.setModel(dataConnection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.out.println(" We did not make our data connection");
            }
        dataConnection.studentNameQueryStatement();
        controller.getStudentNames();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("sample.Student/Course Interface");
        primaryStage.setScene(new Scene(root, 600, 475));
        System.out.println("We loaded FXML");

        primaryStage.show();
    }



    public static void main(String[] args)
    {

        launch(args);
    }

}
