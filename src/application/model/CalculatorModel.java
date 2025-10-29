package application.model;

import java.util.Scanner;
import java.util.Stack;
//remaque for us : si on veux realiser l'operation a-b il faut saisir a puis b
public class CalculatorModel implements CalculatorModelInterface{
	private Stack<Double> accu = new Stack();
	private Scanner scan = new Scanner(System.in);
	double a = 0, b=0;
	public double pop() {
		try {
			return (double)accu.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0.0;
		}
	}
	
	public void push(double a) {
		accu.push(a);
	}
	public double add() {
		a = pop();
		b = pop();
		return a+b;
	}
	public double substract() {
		
		a = pop();
		b = pop();
		return a-b;
	}
	public double multiply() {
		a = pop();
		b = pop();
		return a*b;
	}
	public double divide() {
		a=pop();
		b=pop(); 
		if(b == 0) return 2;
		return a/b;
	}
	public void drop() { //deletes the last element in the stack 
		accu.pop();
	}
	public void dropAll() {
		accu.clear();
	}
	public void swap() {
		//first number X then Y the stack will look like [X,Y]
		//the operation will be Y op X
		//this function's purpose is to switch the places of the number so it becomes : X op Y
		a = pop(); //Y
		b = pop(); //X
		push(a);
		push(b);
		
	}
	public double opposite() {
		a = pop();
		return -a;
	}
	public void clear(){
		//vide l'accumulateur ==> dernier colonne dans la pile
		
	}
	 
	 

	public Stack<Double> getAccu() {
		return accu;
	}

	public void setAccu(Stack<Double> accu) {
		this.accu = accu;
	}
}
