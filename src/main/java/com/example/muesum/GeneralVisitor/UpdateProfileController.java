package com.example.muesum.GeneralVisitor;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UpdateProfileController
{
    private String name;
    private String email;
    private int phoneNo;

    public UpdateProfileController(String name, String email, int phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
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

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @javafx.fxml.FXML
    private TableColumn<UpdateProfileController,String> nameTC;
    @javafx.fxml.FXML
    private TableColumn<UpdateProfileController,String> emailTC;
    @javafx.fxml.FXML
    private TableColumn<UpdateProfileController,Integer> phoneNoTC;
    @javafx.fxml.FXML
    private TableView<String> tableview;
    @javafx.fxml.FXML
    private Label successLabel;

    @javafx.fxml.FXML
    public void initialize() {
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailTC.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneNoTC.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));



    }

    @javafx.fxml.FXML
    public void updateOA(ActionEvent actionEvent) {
    }
}