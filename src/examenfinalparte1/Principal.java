package examenfinalparte1;
import java.io.IOException;
/**
 * clase encargada de imprimir los datos por pantalla
 * @author juchafernandez
 */
public class Principal {
public static void main(String[] args) throws IOException{
Sumas suma1 = new Sumas(10,20);
int resultadosuma1 = suma1.getResultado();
System.out.println("Es: " + resultadosuma1);
Sumas suma2 = new Sumas(10);
int resultadosuma2 = suma2.getResultado();
System.out.println("Es: " + resultadosuma2);
Sumas suma3 = new Sumas();
int resultadosuma3 = suma3.getResultado();
System.out.println("Es: " + resultadosuma3);}}
