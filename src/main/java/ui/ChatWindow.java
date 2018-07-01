package ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class ChatWindow implements Initializable {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    public void initialize(URL location, ResourceBundle resources){

    }

    public void sendText(){
        textArea.appendText(textField.getText() + "\n");
        textField.setText("");
        textField.requestFocus();
    }

}
