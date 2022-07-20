package com.seeable.typesupdate;

import Data.DataTableRow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class HelloController
{
    @FXML
    private Label welcomeText;

    @FXML
    private TableView<DataTableRow> tableFormat;

    @FXML
    private TableColumn<DataTableRow, Integer> kolom;

    @FXML
    private TableColumn<DataTableRow, String> veldnaam;

    @FXML
    private TableColumn<DataTableRow, String> toelichting;

    @FXML
    private TableColumn<DataTableRow, Integer> typePropertyID;

    ObservableList<DataTableRow> list = FXCollections.observableArrayList(
            new DataTableRow(1,"test","d",1320)
            );

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
        updateColums();
        //CheckLines checkLines = new CheckLines();
        //checkLines.checkLines();
    }

    public void updateColums(){
        kolom.setCellValueFactory(new PropertyValueFactory<DataTableRow, Integer>("kolom"));
        veldnaam.setCellValueFactory(new PropertyValueFactory<DataTableRow, String>("veldnaam"));
        toelichting.setCellValueFactory(new PropertyValueFactory<DataTableRow, String>("toelichting"));
        typePropertyID.setCellValueFactory(new PropertyValueFactory<DataTableRow, Integer>("typePropertyID"));

        tableFormat.setItems(list);
    }
}