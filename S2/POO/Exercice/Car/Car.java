package Exercice.Car;


import java.util.*;


public class Car {

	public final static int N_WHEELS = 4 ;

	private String brand ;

	private Wheel[] Wheels = new Wheel[N_WHEELS];

	private int n ;

	private Engine Engine = new Engine() ;

	public Car(String brand)

	{

		this(brand, 4) ;

	}

	public Car(String brand, int n)

	{

		if (n<0 || n>N_WHEELS)

		{

			// à gérer avec exception en temps voulu.

			System.out.println("trop de roues, n=4") ;

			n = 4 ;

		}

		this.brand = brand ;

		this.n = n ;

		for (int i=0 ; i<n ; i++)

		{

			Wheels[i] = new Wheel(i) ;

		}

	}

	public boolean blowout(int i)

	{

		if (Wheels[i] == null)

			return false ;

		Wheels[i] = null ;

		n-- ;

		return true ;

	}

	public int getNWheels()

	{

		return n ;

	}

}


