package ejercicio2;
import java.util.*;
public class Productos {
	   private String nombre;
	    private int cantidad;
	    private double precio;
	    

	public Productos(String nombre, int cantidad, double precio) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.precio=precio;
	}
String nombre() {
	return nombre;
}
int cantidad() {
	return cantidad;
}
double precio() {
	return precio;
}
double precio_total() {
	return cantidad*precio;
}
   }
