package com.seeable.typesupdate;

import FileReader.ArtLevReader;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController
{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
        ArtLevReader artLevReader = new ArtLevReader("E:\\Q-PAB\\artlev.txt");
        artLevReader.getData();
    }
}