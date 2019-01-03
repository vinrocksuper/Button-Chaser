package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage window;
    static Scene s1;
    static Scene s2;



   @Override
    public void start(Stage primaryStage) throws Exception{
       window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Hello World");
        s1 = new Scene(root, 300, 275);
        window.setScene(s1);
        window.show();


       Button x = new Button("Return");

       x.setOnAction(e -> window.setScene(s1));
       Label l = new Label("HIGH SCORES");
       VBox l2 = new VBox();

        l2.getChildren().addAll(l,x);

        s2 = new Scene(l2,300,300);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
