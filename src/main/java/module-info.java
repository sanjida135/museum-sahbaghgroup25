module com.example.muesum {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires java.management;


    opens com.example.muesum to javafx.fxml;
    exports com.example.muesum;
}