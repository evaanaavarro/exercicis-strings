import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escriu una cadena: ");
        String cadena = teclado.nextLine();

        String resultado = "";

        if (cadena.length() >= 2) {
            resultado = cadena.substring(0, 2) + cadena.substring(cadena.length() - 2);
        }

        System.out.println("Resultat: " + resultado);
    }
}
