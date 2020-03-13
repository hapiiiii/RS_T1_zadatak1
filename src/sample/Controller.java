package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label message;

    public void sayHello(ActionEvent actionEvent) {

        message.setText(" Hello World") ;
    }
}