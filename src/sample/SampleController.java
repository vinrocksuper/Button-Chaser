package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label helloWorld;
    public Label score;
    private int count =0;
    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }

    public void increment(ActionEvent actionEvent) {
        count++;
        score.setText("" + count);
    }
}
