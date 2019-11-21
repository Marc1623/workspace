package Exercice.Car;
import java.util.*;


public class CarTest {

	public static void main(String[] args) {

		Car citroen = new Car("citroen") ;

		System.out.println(citroen.getNWheels()) ;

		citroen.blowout(2) ;

		System.out.println(citroen.getNWheels()) ;

		citroen.blowout(2) ;

		System.out.println(citroen.getNWheels()) ;

		citroen.blowout(1) ;

		System.out.println(citroen.getNWheels()) ;

	}

} 
