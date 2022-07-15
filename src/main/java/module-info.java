module com.seeable.typesupdate {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.seeable.typesupdate to javafx.fxml;
    exports com.seeable.typesupdate;
}