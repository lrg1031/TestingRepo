module com.mycompany.lukegreen_assignment02_csc311 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lukegreen_assignment02_csc311 to javafx.fxml;
    exports com.mycompany.lukegreen_assignment02_csc311;
}
