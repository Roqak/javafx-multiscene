package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Controller implements Initializable {


    private Stage stage,nstage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    Button openRegister, dateOpened,showFlatFile,subjectCode;

//    @FXML
//    Button dateOpened;
//    @FXML
//    Button flatFile;


    @FXML
    private void openRegister() throws IOException{
        stage = (Stage) openRegister.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("scene3.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
//        System.out.println("Register.fxml opened");
    }


    @FXML
    private void dateOpened() throws IOException{
        System.out.println("Register.fxml opened");
        stage = (Stage) openRegister.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("scene4.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
//        System.out.println("Register.fxml opened");
    }

    @FXML
    private void showFlatFile() throws IOException{
        System.out.println("Register.fxml opened");
        stage = (Stage) showFlatFile.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
//        System.out.println("Register.fxml opened");
    }
    @FXML
    private void subjectCode() throws IOException{
        System.out.println("Register.fxml opened");
        stage = (Stage) subjectCode.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("scene3.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
//        System.out.println("Register.fxml opened");
    }


}
