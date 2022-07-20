module com.seeable.typesupdate {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;


    opens com.seeable.typesupdate to javafx.fxml;
    exports com.seeable.typesupdate;
}