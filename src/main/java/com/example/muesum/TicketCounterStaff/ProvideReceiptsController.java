package com.example.muesum.TicketCounterStaff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javax.swing.text.Document;
import java.io.FileOutputStream;

public class ProvideReceiptsController
{
    @FXML
    private TextField receiptConfirmation;

    public ProvideReceiptsController(TextField receiptConfirmationTF) {
        this.receiptConfirmationTF = receiptConfirmationTF;
    }

    public TextField getReceiptConfirmation() {
        return receiptConfirmation;
    }

    public void setReceiptConfirmation(TextField receiptConfirmation) {
        this.receiptConfirmation = receiptConfirmation;
    }

    public TextField getReceiptConfirmationTF() {
        return receiptConfirmationTF;
    }

    public void setReceiptConfirmationTF(TextField receiptConfirmationTF) {
        this.receiptConfirmationTF = receiptConfirmationTF;
    }

    @Override
    public String toString() {
        return "ProvideReceiptsController{" +
                "receiptConfirmation=" + receiptConfirmation +
                ", receiptConfirmationTF=" + receiptConfirmationTF +
                '}';
    }

    @javafx.fxml.FXML
    private TextField receiptConfirmationTF;

    @javafx.fxml.FXML
    public void initialize() {
        receiptConfirmationTF.setPromptText("Enter receipt details here");
    }

    @javafx.fxml.FXML
    public void saveRecieptAsPdfOA(ActionEvent actionEvent) {
        String receiptText = receiptConfirmationTF.getText();
        if (receiptText == null || receiptText.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please enter receipt details before saving.");
            alert.showAndWait();
            return;
        }
    }
}