package main;

public class ArithmeticException extends Exception{

	public ArithmeticException (){
        super("le montant ne peux �tre n�gatif");
    }
}
