module com.example.muesum {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.muesum to javafx.fxml;
    exports com.example.muesum;
}