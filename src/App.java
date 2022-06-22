import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
 
public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
           Parent root;
           try {
            root = FXMLLoader.load(getClass().getResource("main.fxml"));
            Scene scene = new Scene(root);



            primaryStage.setTitle("Hello wrld");
            primaryStage.setScene(scene);
            primaryStage.show();
           } catch(IOException e){}           
        }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}