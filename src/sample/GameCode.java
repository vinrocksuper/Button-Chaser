package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.animation.AnimationTimer;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GameCode implements Initializable {
  /**  private ArrayList<String> colorList = new ArrayList<>();
    private int diff = 1;
    public Button a;
    private String[] constants = {"#ff0000","#ffff00","#0000ff","#00ff00"};
    public void genColor(){
        for(int i=0;i<diff;i++)
        {
            int temp = (int)(Math.random()*4);
            if(temp == 0){
                colorList.set(i,"red");
            }
            if(temp == 1){
                colorList.set(i,"yellow");
            }
            if(temp == 2){
                colorList.set(i,"blue");
            }
            else{
                colorList.set(i,"green");
            }
        }

    }
    public void changeColor(){
        genColor();
        for(int i=0;i<colorList.size();i++)
        {
            if(colorList.get(i).equals("red"))
            {
                a.setStyle("-fx-background-color:"+constants[0]);
            }
            if(colorList.get(i).equals("yellow"))
            {
                a.setStyle("-fx-background-color:"+constants[1]);
            }
            if(colorList.get(i).equals("blue"))
            {
                a.setStyle("-fx-background-color:"+constants[2]);
            }
            if(colorList.get(i).equals("green"))
            {
                a.setStyle("-fx-background-color:"+constants[3]);
            }
        }
    } */

  public Label score;
  public Button a;
  public Button b;
    private int count =0;
    private boolean start = false;
    private boolean counting = true;


    public void increment(ActionEvent actionEvent) {
        if(counting) {
            count++;
            score.setText("" + count);
        }

    }
    public void switchPg()
    {
        Main.window.setScene(Main.s2);

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
        start = true;
        increment(e);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        {

        }
    }
}
