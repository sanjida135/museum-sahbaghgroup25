package com.example.muesum.GeneralVisitor;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterController
{
    private String name,email,password;

    public RegisterController(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RegisterController{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private Label confirmationLabel;

    @javafx.fxml.FXML
    public void initialize() {
        nameTF.setPromptText("Enter your full name");
        emailTF.setPromptText("Enter your email");
        passwordTF.setPromptText("Enter your password");
    }

    @javafx.fxml.FXML
    public void registerOA(ActionEvent actionEvent) {
        String nameInput = nameTF.getText().trim();
        String emailInput = emailTF.getText().trim();
        String passInput = passwordTF.getText().trim();


        if (nameInput.isEmpty() || emailInput.isEmpty() || passInput.isEmpty()) {
            confirmationLabel.setText(" Please fill out all fields!");
            return;
        }


        this.name = nameInput;
        this.email = emailInput;
        this.password = passInput;


        confirmationLabel.setText(" Registration Successful!");


        System.out.println("Registered: " + this.toString());
    }
}