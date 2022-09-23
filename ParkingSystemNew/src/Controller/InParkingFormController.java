package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class InParkingFormController {
    public AnchorPane VehicleDetailsContext;
    public ComboBox cmbInParking;
    public Button btnAddVehicle;
    public Button btnLogOut;
    public Button btnAddDriver;
    public TableView tblVehicleDetails;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colParkingSlot;
    public TableColumn colParkedTime;

    public void SetAddVehicleOnAction(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/MainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void SetAddDriverOnAction(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
