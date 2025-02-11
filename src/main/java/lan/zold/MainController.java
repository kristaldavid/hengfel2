/*
* File: MainController.java
* Author: Kristál Dávid 
* Copyright: 2025, Kristál Dávid
* Group: Szoft II-2-N
* Date: 2025-02-06
* Github: https://github.com/kristaldavid/
* Licenc: MIT
*/
package lan.zold;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField lengthField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceareaField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
            double r = Double.parseDouble(radiusField.getText());
            double l = Double.parseDouble(lengthField.getText());
            double surfaceArea = 2 * Math.PI * r * (r + l);
            surfaceareaField.setText(String.valueOf(surfaceArea));
    }
}
