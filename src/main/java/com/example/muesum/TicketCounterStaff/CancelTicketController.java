package com.example.muesum.TicketCounterStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CancelTicketController
{
    private Integer id;

    public CancelTicketController(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CancelTicketController{" +
                "id=" + id +
                '}';
    }

    @javafx.fxml.FXML
    private Label SuccessLabel;
    @javafx.fxml.FXML
    private TextField ticketIdTF;

    @javafx.fxml.FXML
    public void initialize() {
        SuccessLabel.setText("");
        ticketIdTF.setText("");
        ticketIdTF.setPromptText("Enter Ticket ID to cancel");
    }

    @javafx.fxml.FXML
    public void ButtonOA(ActionEvent actionEvent) {
        String input = ticketIdTF.getText().trim();
        if (input.isEmpty()) {
            SuccessLabel.setText("Please enter a Ticket ID!");
            SuccessLabel.setStyle("-fx-text-fill: red;");
            return;
        }
    }
}