package com.example.muesum.TicketCounterStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class GenerateDailySalesReportController
{
    private DatePicker date;

    public GenerateDailySalesReportController(DatePicker date) {
        this.date = date;
    }

    public DatePicker getDate() {
        return date;
    }

    public void setDate(DatePicker date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GenerateDailySalesReportController{" +
                "date=" + date +
                '}';
    }

    @javafx.fxml.FXML
    private DatePicker dateDP;

    @javafx.fxml.FXML
    public void initialize() {
        dateDP.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {
        LocalDate selectedDate = dateDP.getValue();

        if (selectedDate == null) {
            // Show alert if no date is selected
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Date Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select a date to generate the report.");
            alert.showAndWait();
            return;
        }
        System.out.println("Generating Daily Sales Report for: " + selectedDate);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Report Generated");
        alert.setHeaderText(null);
        alert.setContentText("Daily sales report for " + selectedDate + " has been generated.");
        alert.showAndWait();
    }
}