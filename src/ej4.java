import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriu una cadena: ");
        String cadena = teclado.nextLine();

        if (cadena.length() < 3) {
            System.out.println(cadena);
        } else if (cadena.endsWith("ing")) {
            System.out.println(cadena + "ly");
        } else {
            System.out.println(cadena + "ing");
        }
    }
}