package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class CalculatorGUI extends BorderPane implements CalculatorGUIInterface{
	
	@FXML
	private Label swap;
	@FXML
	private Label c;
	@FXML
	private Label next;
	@FXML
	private Label typer;
	@FXML
	private Label op;
	@FXML
	private Label num2;
	@FXML
	private Label hist1;
	@FXML
	private Label hist2;
	@FXML
	private Label hist3;
	@FXML
	private Label hist4;
    @FXML 
    private Label un;
    @FXML 
    private Label deux;
    @FXML 
    private Label trois;
    @FXML 
    private Label quatre;
    @FXML 
    private Label cinq;
    @FXML 
    private Label six;
    @FXML 
    private Label sept;
    @FXML 
    private Label huit;
    @FXML 
    private Label neuf;
    @FXML 
    private Label zero;
    @FXML 
    private Label ac;
    @FXML 
    private Label plus;
    @FXML 
    private Label moin;
    @FXML 
    private Label mul;
    @FXML 
    private Label div;
    @FXML
    private Label oppo;
    @FXML
    private Label virgule;
	public CalculatorGUI() {
	    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Sample.fxml"));
	    fxmlLoader.setRoot(this);
	    fxmlLoader.setController(this);
	    try {
	        fxmlLoader.load();
	    } catch (IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	public Label getTyper() {
		return typer;
	}
	public void setTyper(Label typer) {
		this.typer = typer;
	}
	public Label getHist1() {
		return hist1;
	}
	public void setHist1(Label hist1) {
		this.hist1 = hist1;
	}
	public Label getHist2() {
		return hist2;
	}
	public void setHist2(Label hist2) {
		this.hist2 = hist2;
	}
	public Label getHist3() {
		return hist3;
	}
	public void setHist3(Label hist3) {
		this.hist3 = hist3;
	}
	public Label getHist4() {
		return hist4;
	}
	public void setHist4(Label hist4) {
		this.hist4 = hist4;
	}
	public void change(String accu) { //la valeur de l'accumulateur
		this.typer.setText(accu);
	}
	public void change(double a) { //historique
		if (this.hist1.getText().isEmpty()) {
			this.hist1.setText(String.valueOf(a));
		}
		else {
			this.hist4.setText(this.hist3.getText());
			this.hist3.setText(this.hist2.getText());
			this.hist2.setText(this.hist1.getText());
			this.hist1.setText(String.valueOf(a));
			
		}
	}
	public Label getUn() {
		return un;
	}
	public void setUn(Label un) {
		this.un = un;
	}
	public Label getDeux() {
		return deux;
	}
	public void setDeux(Label deux) {
		this.deux = deux;
	}
	public Label getTrois() {
		return trois;
	}
	public void setTrois(Label trois) {
		this.trois = trois;
	}
	public Label getQuatre() {
		return quatre;
	}
	public void setQuatre(Label quatre) {
		this.quatre = quatre;
	}
	public Label getCinq() {
		return cinq;
	}
	public void setCinq(Label cinq) {
		this.cinq = cinq;
	}
	public Label getSix() {
		return six;
	}
	public void setSix(Label six) {
		this.six = six;
	}
	public Label getSept() {
		return sept;
	}
	public void setSept(Label sept) {
		this.sept = sept;
	}
	public Label getHuit() {
		return huit;
	}
	public void setHuit(Label huit) {
		this.huit = huit;
	}
	public Label getNeuf() {
		return neuf;
	}
	public void setNeuf(Label neuf) {
		this.neuf = neuf;
	}
	public Label getZero() {
		return zero;
	}
	public void setZero(Label zero) {
		this.zero = zero;
	}
	public Label getAc() {
		return ac;
	}
	public void setAc(Label ac) {
		this.ac = ac;
	}
	public Label getSwap() {
		return swap;
	}
	public void setSwap(Label swap) {
		this.swap = swap;
	}
	public Label getC() {
		return c;
	}
	public void setC(Label c) {
		this.c = c;
	}
	public Label getNext() {
		return next;
	}
	public void setNext(Label next) {
		this.next = next;
	}
	public Label getPlus() {
		return plus;
	}
	public void setPlus(Label plus) {
		this.plus = plus;
	}
	public Label getMoin() {
		return moin;
	}
	public void setMoin(Label moin) {
		this.moin = moin;
	}
	public Label getMul() {
		return mul;
	}
	public void setMul(Label mul) {
		this.mul = mul;
	}
	public Label getDiv() {
		return div;
	}
	public void setDiv(Label div) {
		this.div = div;
	}
	public Label getOp() {
		return op;
	}
	public void setOp(Label op) {
		this.op = op;
	}
	public Label getNum2() {
		return num2;
	}
	public void setNum2(Label num2) {
		this.num2 = num2;
	}
	public Label getOppo() {
		return oppo;
	}
	public void setOppo(Label oppo) {
		this.oppo = oppo;
	}
	public Label getVirgule() {
		return virgule;
	}
	public void setVirgule(Label virgule) {
		this.virgule = virgule;
	}
	

}
