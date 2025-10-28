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
		return b-a;
	}
	public double multiply() {
		a = pop();
		b = pop();
		return a*b;
	}
	public double divide() {
		a=pop();
		b=pop(); 
		return b/a;
	}
	public void drop() {
		accu.pop();
	}
	public void dropAll() {
		accu.clear();
	}
	public void swap() {
		a = pop();
		b = pop();
		accu.push(a);
		accu.push(b);
		
	}
	public double opposite() {
		a = pop();
		return -a;
	}
	/* public void clear(){}
	 * 
	 */

	public Stack<Double> getAccu() {
		return accu;
	}

	public void setAccu(Stack<Double> accu) {
		this.accu = accu;
	}
}
