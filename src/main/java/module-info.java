module com.example.selenium {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.groovy;


    opens com.example.selenium to javafx.fxml;
    exports com.example.selenium;
}