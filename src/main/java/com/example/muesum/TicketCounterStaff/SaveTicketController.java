package com.example.muesum.TicketCounterStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SaveTicketController
{
    private String ticket,visitorName;

    public SaveTicketController(String ticket, String visitorName) {
        this.ticket = ticket;
        this.visitorName = visitorName;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    @Override
    public String toString() {
        return "SaveTicketController{" +
                "ticket='" + ticket + '\'' +
                ", visitorName='" + visitorName + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    private TableColumn<SaveTicketController,String>ticketselectionTC;
    @javafx.fxml.FXML
    private TableView<String> tableview;
    @javafx.fxml.FXML
    private TableColumn<SaveTicketController,String>ticketypeTC;
    @javafx.fxml.FXML
    private TableColumn<SaveTicketController,String>visitornameTC;

    @javafx.fxml.FXML
    public void initialize() {
        ticketselectionTC.setCellValueFactory(new PropertyValueFactory<>("ticket"));
        visitornameTC.setCellValueFactory(new PropertyValueFactory<>("visitorName"));
        ticketypeTC.setCellValueFactory(new PropertyValueFactory<>("ticket"));

    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {

    }
}