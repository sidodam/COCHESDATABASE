package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField txtfield  ;

    @FXML
    public Label label ;


    String x ;

    public void button (ActionEvent actionEvent)
    {

        x = txtfield.getText();

        label.setText(x);


    }

}
