package com.example.muesum.TicketCounterStaff;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.print.DocFlavor;
import java.sql.Time;

public class SellTicketController
{
    private String visitorName,ticket;
    private DatePicker date;

    public SellTicketController(String visitorName, String ticket, DatePicker date) {
        this.visitorName = visitorName;
        this.ticket = ticket;
        this.date = date;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public DatePicker getDate() {
        return date;
    }

    public void setDate(DatePicker date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SellTicketController{" +
                "visitorName='" + visitorName + '\'' +
                ", ticket='" + ticket + '\'' +
                ", date=" + date +
                '}';
    }

    @javafx.fxml.FXML
    private TableColumn<String, Time> timeTC;
    @javafx.fxml.FXML
    private ComboBox<String> tickettypeCB;
    @javafx.fxml.FXML
    private TableView<String> tableview;
    @javafx.fxml.FXML
    private TableColumn<SellTicketController,Integer> dateTC;
    @javafx.fxml.FXML
    private TextField visitornameTF;
    @javafx.fxml.FXML
    private Label Success;

    @javafx.fxml.FXML
    public void initialize() {
        tickettypeCB.getItems().addAll("Regular", "Student", "Foreign");
        tickettypeCB.setPromptText("Select Ticket Type");
        TableColumn<SellTicketController, String> visitorNameCol = new TableColumn<>("Visitor Name");
        visitorNameCol.setCellValueFactory(new PropertyValueFactory<>("visitorName"));
        TableColumn<SellTicketController, String> ticketCol = new TableColumn<>("Ticket Type");
        ticketCol.setCellValueFactory(new PropertyValueFactory<>("ticket"));


    }}