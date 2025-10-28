package application.model;

import java.util.Stack;

public interface CalculatorModelInterface {
	public static final double a = 0;
	public static final double b = 0;
	Stack<Double> accu = new Stack();
	public default double add() {
		return a+b;
	}
	public default double substract() {
		return a-b;
	}
	public default double multiply() {
		return a*b;
	}
	public default double divide() {
		return a/b;
	}
	public default double opposite() {
		return -a;
	}
	public default void push(double a) {
	}
	public default double pop() {
		return a;
	}
	public default void clear() { 
		//on vide l'accumulateur mais pas le contenu de la pile
		
	}
	public default void drop() {
		
	}
	public default void dropAll() {
		//on vide le contenu de l'accumulateur et de la pile
	}
	public default void swap() {
		
	}
	public default Stack<Double> getAccu() {
		return accu;
	}

	public default void setAccu(Stack<Double> accu) {
		
	}
	

}
