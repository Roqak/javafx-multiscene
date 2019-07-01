//package sample;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//
//
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//public class DateController implements Initializable {
//
//
//    private Stage stage;
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//    }
//
//
//    @FXML
//    Button dateOpened;
//
//
//    @FXML
//    private void dateOpened() throws IOException{
//        stage = (Stage) dateOpened.getScene().getWindow();
//        AnchorPane root;
//        root = (AnchorPane) FXMLLoader.load(getClass().getResource("scene4.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
////        System.out.println("Register.fxml opened");
//    }
//}
