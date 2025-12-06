package com.example.muesum.GeneralVisitor;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBookingHistoryController
{
    private String history;
    private int date;

    public ViewBookingHistoryController(String history, int date) {
        this.history = history;
        this.date = date;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ViewBookingHistoryController{" +
                "history='" + history + '\'' +
                ", date=" + date +
                '}';
    }

    @javafx.fxml.FXML
    private TableColumn<ViewBookingHistoryController,String> historyTableTC;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableView<String> tableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void historyOA(ActionEvent actionEvent) {
    }
}