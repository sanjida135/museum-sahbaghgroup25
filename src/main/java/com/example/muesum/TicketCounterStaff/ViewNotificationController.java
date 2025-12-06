package com.example.muesum.TicketCounterStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.management.Notification;

public class ViewNotificationController
{
    @javafx.fxml.FXML
    private TableColumn<ViewNotificationController,String> notificationListTC;
    @javafx.fxml.FXML
    private TableView<String> tableview;
    @javafx.fxml.FXML
    private TableColumn<ViewNotificationController,String> notificationContent;

    @javafx.fxml.FXML
    public void initialize() {
        notificationListTC.setCellValueFactory(new PropertyValueFactory<>("title"));
        notificationContent.setCellValueFactory(new PropertyValueFactory<>("content"));

    }

    @javafx.fxml.FXML
    public void readOA(ActionEvent actionEvent) {

    }
}