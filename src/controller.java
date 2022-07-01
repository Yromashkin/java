import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.fxml.Initializable;

public class controller implements Initializable {
    
    @FXML
    void btnr(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }

    public void btnOKclicked(ActionEvent event) throws Exception {
		menu menu=new menu();
		menu.showWindow();
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();     
	}
    



}