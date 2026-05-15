module com.soner.loginapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.soner.loginapp to javafx.fxml;
    exports com.soner.loginapp;
}