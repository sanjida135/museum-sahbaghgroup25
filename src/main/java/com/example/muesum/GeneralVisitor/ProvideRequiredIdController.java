package com.example.muesum.GeneralVisitor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ProvideRequiredIdController {


    private TextField visitorIdTF;


    private TextField idCategoryTF;


    private Label verifiedLabel;


    public void initialize() {
        verifiedLabel.setVisible(false);
    }


    public void onVerifyButtonClick() {
        String visitorId = visitorIdTF.getText();
        String idCategory = idCategoryTF.getText();

        if (visitorId.isEmpty() || idCategory.isEmpty()) {
            verifiedLabel.setText("Please enter all fields.");
            verifiedLabel.setVisible(true);
            return;
        }


        if (visitorId.matches("\\d+") && idCategory.length() >= 3) {
            verifiedLabel.setText("ID Verified Successfully!");
        } else {
            verifiedLabel.setText("Invalid ID or Category!");
        }

        verifiedLabel.setVisible(true);
    }
}
