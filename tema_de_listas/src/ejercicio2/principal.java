package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in) ;
ArrayList<Productos> listaproducto=new ArrayList<Productos>();
double preciototal=0;
while (true) {
	System.out.println("introduce el nombre del producto o fin para terminar");
String nombre=entrada.nextLine();
if (nombre.equalsIgnoreCase("Fin")) {
break;	
}

System.out.println("intoduce la cantidad:");
int cantidad=Integer.parseInt(entrada.nextLine());
System.out.println("introduce el precio:");
double precio=Double.parseDouble(entrada.nextLine());
Productos producto =new Productos(nombre,cantidad,precio);
listaproducto.add(producto);
}

for(Productos producto:listaproducto) {
	preciototal+=producto.precio_total();	
}
System.out.println("ticket de compra");
System.out.println("------------------");

for(Productos producto:listaproducto) {
	System.out.println(producto.nombre() + "x" + producto.cantidad()+ producto.precio_total());
	producto.precio_total();
}
System.out.println("-----------------");
System.out.println("precio total:"+ preciototal);
}
}
