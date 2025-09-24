//prog0202.java
//Programa de prueba de la clase Rectangulo

import java.util.Scanner;
public class Prog0202 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Mensaje de presentacion de la clase rectangulo
    System.out.println("Programa de prueba de la clase Rectangulo");
    System.out.println();
    //Lectura de datos
    System.out.print("Proporcione los datos del primer rectangulo: ");
    System.out.print("Ancho:");
    double ancho = entrada.nextDouble();
    System.out.print("Alto:");
    double alto = entrada.nextDouble();
    //Creacion del objeto rectangulo1
    Rectangulo r1 = new Rectangulo(ancho, alto);

    System.out.print("Proporcione los datos del segundo rectangulo: ");
    System.out.print("Ancho:");
    ancho = entrada.nextDouble();
    System.out.print("Alto:");
    alto = entrada.nextDouble();
    //Creacion del segundo rectangulo
    Rectangulo r2 = new Rectangulo(ancho, alto);
    //mostrar los datos de los rectangulos
    System.out.println();
    System.out.println(r1);
    System.out.println(r2);
    entrada.close();
  }
}
