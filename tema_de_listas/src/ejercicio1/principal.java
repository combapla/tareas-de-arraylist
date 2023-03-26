package ejercicio1;

import java.util.Scanner;

public class principal {
	 public static void main(String[] args) {
	        metodos programa = new metodos();
	        Scanner entrada= new Scanner(System.in);
	        int num;
	        do {
	            System.out.print("Ingrese un número (0 para terminar): ");
	            num = entrada.nextInt();
	            programa.agregar_numero(num);
	        } while (num != 0);
            programa.numeros.remove(programa.numeros.size() - 1); // Eliminar el 0
	        programa.mostrar_numeros();
	        programa.intercambiar_posiciones();
	        programa.mostrar_numeros();
	    }
}
