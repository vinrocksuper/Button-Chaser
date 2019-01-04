package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.animation.AnimationTimer;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class GameCode implements Initializable {
    public Label score;
     public Button a;
     public Button b;
     static String name;
     public TextField field;
   static int count =0;
    private boolean start = false;
    private boolean counting = true;


    public void increment() {
        if(counting) {
            count++;
            score.setText("" + count);
            a.setTranslateX(Math.random() *200);
            a.setTranslateY(Math.random() *200);
        }

    }

    public void firstClick(ActionEvent e)
    {
        if(!start) {
            long step = System.nanoTime() + 10000000000L;
            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    if (now > step) {
                        counting = false;
                        score.setText("You ended with " + count);
                        b.setVisible(true);
                    }
                }
            }.start();
        }
        name = field.getText();
        field.setVisible(false);
        start = true;
        increment();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        {
            field.setPromptText("Name");
        }
    }

    public void switchPg() {
        Main.window.setScene(Main.s2);
    }
}
