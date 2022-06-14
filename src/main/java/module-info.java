module com.example.llab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.llab6 to javafx.fxml;
    exports com.example.llab6;
}