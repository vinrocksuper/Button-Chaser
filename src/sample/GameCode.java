package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
public class GameCode {
    private String[] colorList;
    private int diff = 1;
    public String[] genColor(){
        for(int i=0;i<diff;i++)
        {
            int temp = (int)(Math.random()*4);
            if(temp == 0){
                colorList[i] = "red";
            }
            if(temp == 1){
                colorList[i] = "yellow";
            }
            if(temp == 2){
                colorList[i] = "blue";
            }
            else{
                colorList[i] = "green";
            }
        }
        return colorList;
    }
    public void changeColor(){

    }

}
