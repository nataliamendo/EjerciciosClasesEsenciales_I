package Ejercicio12;
import java.util.Scanner;
 
public class ClienteSocket {
	
    public static void main(String[] args)
    {
    	int p; //donde guardaremos la opción del usuario (TPC = 0, UDP = 1 )
    	System.out.println("EjercicoClienteSockets");
    	ProtocoloCliente pc = new ProtocoloCliente();
    	
    	
    	System.out.println("¿Qué protocolo se utilizará?");
    	System.out.println(" [0] TCP");
    	System.out.println(" [1] UDP");
    	//Scanner para leer del teclado del usuario
    	Scanner scan = new Scanner(System.in);
    	
    	p=0;
    	try {
    		p = scan.nextInt();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	if (p == 0) {
    		System.out.println(" [ TCP ]");
    		while (pc.ProtocoloTCP() == 0) {
    			// While infito realiza peticion e imprime resolucion
    			// finalizado salta y finaliza
    		}
    	} else {
    		System.out.println(" [ UCP ]");
    	
    	
    		while (pc.ProtocoloUDP() == 0) {
    			// While infito realiza peticion e imprime resolucion
    			// finalizado salta y finaliza
    		}
    	}
    	System.out.println("*******************");
    	System.out.println(" Cliente cerrado ");
    	System.out.println("*******************");
    }
    
    
}
