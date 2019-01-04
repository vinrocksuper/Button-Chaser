package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static Stage window;
    static Scene s1;
    static Scene s2;



   @Override
    public void start(Stage primaryStage) throws Exception{
       window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Chase the Button");
        s1 = new Scene(root, 600, 600);
        window.setScene(s1);


        window.show();


       Button x = new Button("Return");

       x.setOnAction(e -> window.setScene(s1));
       Label l = new Label("HIGH SCORES");
       VBox l2 = new VBox();
       List<BackEnd.records> test = BackEnd.fromCSV();
       String text;
       int currentMax1 = 0;
       int currentMax2 = 0;
       int currentMax3 = 0;
       String C1 = "";
       String C2 = "";
       String C3 = "";
       for (int i=0;i<test.size();i++)
       {
           if(test.get(i).getClicks()>currentMax3)
           {
               currentMax3 = test.get(i).getClicks();
               C3 = test.get(i).getName();
               if(test.get(i).getClicks()>currentMax2)
               {
                   int temp = currentMax2;
                   currentMax2 = currentMax3;
                   currentMax3 = temp;
                   String s = C2;
                   C2 = C3;
                   C3 = s;
                   if(test.get(i).getClicks()>currentMax1)
                   {
                        temp = currentMax1;
                        currentMax1 = currentMax2;
                        currentMax2 = temp;
                        s = C1;
                        C1 = C2;
                        C2 = s;
                   }
               }
           }
       }
       text = C1 + " "+  currentMax1 + "\n" + C2 + " "+ currentMax2 + "\n" + C3 + " "+ currentMax3;
       Label Hiscores = new Label(text);
        l2.getChildren().addAll(l,Hiscores,x);

        s2 = new Scene(l2,300,300);
    }

    public static void main(String[] args) {
        launch(args);

    }
    public void stop() throws IOException {

       BackEnd.write(BackEnd.fromCSV());
    }
}
