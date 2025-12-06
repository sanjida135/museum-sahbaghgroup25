package com.example.muesum.GeneralVisitor;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PurchaseTicketController
{
    private Integer noOfTickets;
    private String paymentDetails;

    public PurchaseTicketController(Integer noOfTickets, String paymentDetails) {
        this.noOfTickets = noOfTickets;
        this.paymentDetails = paymentDetails;
    }

    public Integer getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(Integer noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public String toString() {
        return "PurchaseTicketController{" +
                "noOfTickets=" + noOfTickets +
                ", paymentDetails='" + paymentDetails + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    private TableColumn<PurchaseTicketController,Integer> noOfTicketsTC;
    @javafx.fxml.FXML
    private TableColumn<PurchaseTicketController,String> paymentDetailsTC;
    @javafx.fxml.FXML
    private TableView<String> tableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void buyTicketOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmPurchaseOA(ActionEvent actionEvent) {
    }
}