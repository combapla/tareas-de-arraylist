package ejercicio1;

import java.util.ArrayList;


public class metodos {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    void agregar_numero(Integer num) {
        numeros.add(num);
    }
    
    void intercambiar_posiciones() {
        int temp = numeros.get(1);
        numeros.set(1, numeros.get(3));
        numeros.set(3, temp);
    }
    
    void mostrar_numeros() {
        System.out.println("Lista de números:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}