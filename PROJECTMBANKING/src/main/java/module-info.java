module com.example.projectmbanking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectmbanking to javafx.fxml;
    exports com.example.projectmbanking;
}