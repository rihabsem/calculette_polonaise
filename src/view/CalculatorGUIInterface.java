package view;

import java.util.Stack;
import javafx.scene.control.Label;

public interface CalculatorGUIInterface {
    // Display methods
    //void affiche();
    void change(String accu);
    void change(double a);

    // Getters and setters for labels
    Label getTyper();
    void setTyper(Label typer);

    Label getHist1();
    void setHist1(Label hist1);

    Label getHist2();
    void setHist2(Label hist2);

    Label getHist3();
    void setHist3(Label hist3);

    Label getHist4();
    void setHist4(Label hist4);
}
