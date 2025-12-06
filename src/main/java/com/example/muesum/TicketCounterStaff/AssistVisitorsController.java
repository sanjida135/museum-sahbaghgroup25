package com.example.muesum.TicketCounterStaff;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AssistVisitorsController
{
    private String name;

    public AssistVisitorsController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AssistVisitorsController{" +
                "name='" + name + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    private TextField eventSerachTF;
    @javafx.fxml.FXML
    private TableColumn<AssistVisitorsController, String> eventNameTC;
    @javafx.fxml.FXML
    private TableView<String> tableView;
    @javafx.fxml.FXML
    private TableColumn<AssistVisitorsController,Integer> eventTimeTC;
    @javafx.fxml.FXML
    private Label availableTicketLabel;

    @javafx.fxml.FXML
    public void initialize() {
        eventNameTC.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        eventTimeTC.setCellValueFactory(new PropertyValueFactory<>("eventTime"));

    }}