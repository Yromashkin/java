

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class profil extends Application {
	 Stage stage=new Stage();
 
	@Override
	public void start(Stage primaryStage) throws Exception{
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("profil.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("профиль");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
        }
    }
 
	public static void main(String[] args) {
		launch(args);
	}
	
	public void showWindow() throws Exception {
		start(stage);
	}
}
