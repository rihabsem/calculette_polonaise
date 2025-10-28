package controler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import view.CalculatorGUIInterface;
import application.model.CalculatorModelInterface;
import view.CalculatorGUI;
import java.util.Stack;

import application.model.CalculatorModel;

public class CalculatorControler implements CalculatorControlerInterface{
	 private CalculatorGUIInterface view;
	    private CalculatorModelInterface model;
	private double result;
	public CalculatorControler(CalculatorGUIInterface view) {
        this.view = view;
        this.model = new CalculatorModel();

        // Wire the buttons manually
        ((CalculatorGUI)view).getUn().setOnMouseClicked(this::click_one);
        ((CalculatorGUI)view).getDeux().setOnMouseClicked(this::click_two);
        ((CalculatorGUI)view).getTrois().setOnMouseClicked(this::click_three);
        ((CalculatorGUI)view).getQuatre().setOnMouseClicked(this::click_four);
        ((CalculatorGUI)view).getCinq().setOnMouseClicked(this::click_five);
        ((CalculatorGUI)view).getSix().setOnMouseClicked(this::click_six);
        ((CalculatorGUI)view).getSept().setOnMouseClicked(this::click_seven);
        ((CalculatorGUI)view).getHuit().setOnMouseClicked(this::click_eight);
        ((CalculatorGUI)view).getNeuf().setOnMouseClicked(this::click_nine);
        ((CalculatorGUI)view).getAc().setOnMouseClicked(this::click_AC);
        //((CalculatorGUI)view).getAc().setOnMouseClicked(this::click_C);
        //((CalculatorGUI)view).getAc().setOnMouseClicked(this::click_SWAP);
        ((CalculatorGUI)view).getNext().setOnMouseClicked(this::change);
        ((CalculatorGUI)view).getPlus().setOnMouseClicked(this::change_op);
        ((CalculatorGUI)view).getMoin().setOnMouseClicked(this::change_op);
        ((CalculatorGUI)view).getMul().setOnMouseClicked(this::change_op);
        ((CalculatorGUI)view).getDiv().setOnMouseClicked(this::change_op);
        
    }
	
	public void change_op(javafx.scene.input.MouseEvent event) {
		//responsable d'indiquer au modele de realiser les operations
		String opSymbol = ((Label) event.getSource()).getText();
		char op = opSymbol.charAt(0);
		if(op == '+') {
			result = model.add();
		}
		else if(op == '-') {
			result = model.substract();
		}
		else if(op == '*') {
			result = model.multiply();
		}
		else{
			result = model.divide();
		}
		view.change(result);
		model.push(result);
		
	}
	
	public void change(javafx.scene.input.MouseEvent event) { 
		//reponsable de envoie au view pour verifier si l'element est un nombre puis le stocker dans la stack dans le modele
		if(view.getTyper().getText().matches("-?\\d+(\\.\\d+)?")) {
			model.push(Double.valueOf(view.getTyper().getText()));
			view.getTyper().setText("");
			//update the view
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
		    alert.setTitle("Stack Contents");
		    alert.setHeaderText("Current Stack State");

		    // Convert the stack to a readable string
		    alert.setContentText(model.getAccu().toString());

		    alert.showAndWait();
		}
	}
	
	public void click_one(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("1");
		else view.getTyper().setText(view.getTyper().getText() + "1");
	}
	public void click_two(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("2");
		else view.getTyper().setText(view.getTyper().getText() + "2");
	}
	@FXML
	public void click_three(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("3");
		else view.getTyper().setText(view.getTyper().getText() + "3");
	}
	public void click_four(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("4");
		else view.getTyper().setText(view.getTyper().getText() + "4");
	}
	public void click_five(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("5");
		else view.getTyper().setText(view.getTyper().getText() + "5");
	}
	public void click_six(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("6");
		else view.getTyper().setText(view.getTyper().getText() + "6");
	}
	public void click_seven(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("7");
		else view.getTyper().setText(view.getTyper().getText() + "7");
	}
	public void click_eight(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("8");
		else view.getTyper().setText(view.getTyper().getText() + "8");
	}
	public void click_nine(javafx.scene.input.MouseEvent event){
		if(view.getTyper().getText().equals("0.0")) view.getTyper().setText("9");
		else view.getTyper().setText(view.getTyper().getText() + "9");
	}
	public void click_AC(javafx.scene.input.MouseEvent event) {
		view.getTyper().setText("");
		view.change(model.pop());
	}
	public void click_zero(javafx.scene.input.MouseEvent event) { 
		view.getTyper().setText("0"); 
		}
	

}
