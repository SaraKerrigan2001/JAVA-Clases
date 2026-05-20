import java.util.Scanner;

public class Decimalbinario {
 public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  System.out.print("Introduce en número decimal entero psitivo:");
  int decimal=teclado.nextInt();

  if (decimal==0)
    System.out.println("El núemero 0 en binario es 0");
  else if (decimal<0) {
    System.out.println("Por favor, introduce un número positivo.");
  }

  else {
    String binario="";
    int numeroTemporal=decimal;
    while (numeroTemporal>0){
        int residuo = numeroTemporal % 2;
        binario = residuo + binario;
        numeroTemporal = numeroTemporal / 2;
    }
    System.out.println("El número " + decimal + " en binario es: " + binario);
  }
  teclado.close();

}
}
