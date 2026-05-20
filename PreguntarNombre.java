import java.util.Scanner;

public class PreguntarNombre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
        teclado.close();
    }
}
