package sample.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import sample.model.Password;

public class AppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnNewPassWord;

    @FXML
    private VBox vboxLabels;

    Password password;

    @FXML
    void initialize() {

        // when new password button is pressed
        btnNewPassWord.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            password = new Password();
            password.createPassword();

            // create a label
            Label label = new Label(password.getPassword());
            label.setFont(Font.font("System", FontWeight.BOLD, 18));

            // add it to the vbox to show the user
            vboxLabels.getChildren().clear();
            vboxLabels.getChildren().add(label);
        });
    }
}
