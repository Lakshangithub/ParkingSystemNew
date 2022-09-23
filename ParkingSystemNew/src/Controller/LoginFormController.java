package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;


public class LoginFormController {

    public AnchorPane LoginContext;
    public TextField txtUserName;
    public PasswordField pwdPassword;



    public void CancelButtonOnAction(ActionEvent actionEvent) throws IOException {

        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you Sure...!", ButtonType.YES,ButtonType.NO);
        Optional<ButtonType> buttonType= alert.showAndWait();

        if (buttonType.get().equals(ButtonType.YES)){
            Stage stage =(Stage) LoginContext.getScene().getWindow();
            stage.close();
        }
    }
    int attempts=0;
    public void LoginButtonOnAction(ActionEvent actionEvent) throws IOException {

        attempts++;
        if (attempts<=3){
            if (txtUserName.getText().equals("admin")&& pwdPassword.getText().equals("1234")){
                new Alert(Alert.AlertType.CONFIRMATION,"Success!").showAndWait();
            }else {
                new Alert(Alert.AlertType.WARNING,"Try Again!").show();
            }
        }else {
            txtUserName.setEditable(false);
            pwdPassword.setEditable(false);
        }

        URL resource = getClass().getResource("../View/InParkingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}