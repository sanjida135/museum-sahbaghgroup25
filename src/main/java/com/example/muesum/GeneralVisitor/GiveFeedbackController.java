package com.example.muesum.GeneralVisitor;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class GiveFeedbackController {

    @javafx.fxml.FXML
    private TextArea feedbackTA;

    @javafx.fxml.FXML
    private Label successLabel;

    @javafx.fxml.FXML
    public void initialize() {
        successLabel.setText("");
    }

    @javafx.fxml.FXML
    public void submitFeedbackOA(ActionEvent actionEvent) {

        String feedback = feedbackTA.getText().trim();

        if (feedback.isEmpty()) {
            successLabel.setText("Please write your feedback before submitting!");
            successLabel.setStyle("-fx-text-fill: red;");
        } else {


            successLabel.setText("Thank you! Your feedback has been submitted.");
            successLabel.setStyle("-fx-text-fill: green;");


            feedbackTA.clear();
        }
    }
}