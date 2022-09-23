package Controller;


import Db.Database;
import Model.*;
import View.tm.DriverTM;
import View.tm.VehicleTM;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URL;

import java.time.LocalDate;
import java.time.LocalTime;


public class MainFormController {


    public AnchorPane ParkingSystemContext;
    public Text txtSelectVehicle;
    public Text txtVehicleType;
    public Text txtDriver;
    public ComboBox cmbSelectVehicle;
    public ComboBox cmbDriver;
    public Text txtSlot;
    public Text txtSlotNumber;
    public Button btnParkVehicle;
    public Button btnOnDeliveryShift;
    public Button btnManagementLogin;
    public TextField txtType;
    public Label lblDateTime;
    public Vehicle selectVehicle;
    public Label lblSlot;


    public void initialize() {
        setDateTime();
        loadData();
        cmbSelectVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
           findVehicle(newValue);
            txtType.setText(selectVehicle.getVehicleType());
            findSlot();

        });

    }
    private void findSlot() {
        switch (selectVehicle.getVehicleType()){
            case "Van" : {
                setslot("Van");
            }break;
            case "Cargo Lorry" : {
                setslot("Cargo Lorry");
            }break;
            case "Bus" : {
                setslot("Bus");
            }break;
        }
    }
    private void setslot(String vehicletype) {
        for (int i=0; i<Database.slotTable.size(); i++){
            for (int j=0; j<Database.slotTable.size(); j++){
                if (vehicletype.equals(Database.slotTable.get(i).getVehicleType()) && Database.slotTable.get(i).getStatus().equals("notUse")) {
                    lblSlot.setText(Database.slotTable.get(i).getSlotNo());
                    return;
                }
            }
        }

    }


    private void findVehicle(Object newValue) {
        int i=-1;

        for (Vehicle v: Database.vehicleTable
        ) {
            i++;
            if(v.getVehicleNo().equals(String.valueOf(newValue) )){
                selectVehicle = Database.vehicleTable.get(i);
            }

        }
    }

    private void loadData() {
        ObservableList<VehicleTM> observableList = FXCollections.observableArrayList();
        for (Vehicle v: Database.vehicleTable) {
            VehicleTM tm = new VehicleTM(v.getVehicleNo());
            observableList.add(tm);
        }

        ObservableList<DriverTM> observableList2 = FXCollections.observableArrayList();
        for (Driver d: Database.driverTable) {
            DriverTM tm = new DriverTM(d.getName());
            observableList2.add(tm);
        }
        cmbSelectVehicle.setItems(observableList);
        cmbDriver.setItems(observableList2);
    }

    private void setDateTime() {
        Timeline clock = new Timeline(new KeyFrame(javafx.util.Duration.ZERO, e->{
            LocalTime currentTime = LocalTime.now();
            LocalDate currentDate = LocalDate.now();
            lblDateTime.setText(currentDate.getYear()+"-"+currentDate.getMonthValue()+"-"+currentDate.getDayOfMonth()+"    "+
                    currentTime.getHour() + ":" + currentTime.getMinute() + ":"+ currentTime.getSecond());

        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    public void ParkVehicleOnAction(ActionEvent actionEvent) {
    }

    public void OnDeliveryShiftOnAction(ActionEvent actionEvent) {
    }

    public void MLoginOnAction(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
