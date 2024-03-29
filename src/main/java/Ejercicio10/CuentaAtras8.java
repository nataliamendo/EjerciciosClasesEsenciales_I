package Ejercicio10;

import java.util.Set;

import Ejercicio10.CuentaAtras8;

public class CuentaAtras8 extends Thread {
	
	//en esta clase se distinguirán el método run() para hacer 'correr' el thread.
	//también un método al que le pasaremos los valores del ID y de 
	//						número desde el que queremos hacer la cuenta atrás
	public static String ID;
	public static int numero;
	
	//variable local donde guardamos la última escritura:
	static String ultimaEscritura8;
		
	//declaramos métodos para la Ultima escritura- GET & SET UltimaEscritura
	public static String getUltimaEscritura() 
	{
		return ultimaEscritura8; //devuelve variable global 'ultimaEscritura'
	}

	public synchronized static void setUltimaEscritura(String ultimaEscritura) 
	{
		CuentaAtras8.ultimaEscritura8 = ultimaEscritura;
		//le pasamos valor de la últimaEscritura y la guarda en la última variable global
	}
	public void run()   
	{
		
	    for (;;)
		{
			
			if(numero==0)
			{
				break;
			}
			else
			{
				//ID2 – 6 - Ultima escritura ID1
				System.out.println(ID + " - " + numero + " - " + getUltimaEscritura());
				numero= numero - 1;
				
			}
		}
	  }
	
	public  synchronized void dame_datos(String id, int num)
	{
		ID = id;
		numero = num;
	}
	
	public void ultimaEscritura()
	{
		
	}

}
