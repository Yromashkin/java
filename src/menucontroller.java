

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;


public class menucontroller implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }
    public void btnprofil(ActionEvent event) throws Exception{
        profil profil=new profil();
        profil.showWindow();
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    public void bntsmena(ActionEvent event) throws Exception{
        smena smena=new smena();
        smena.showWindow();
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    public void btnadddrink(ActionEvent event) throws Exception{
        adddrink adddrink=new adddrink();
        adddrink.showWindow();
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    public void btnaccounting(ActionEvent event) throws Exception{
        accounting accounting=new accounting();
        accounting.showWindow();
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
    
    public void btnexit(ActionEvent event) throws Exception{
        App App=new App();
        App.showWindow();
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
}
