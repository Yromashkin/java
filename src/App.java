import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("main.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("Мой склад");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void showWindow() {
    }
}