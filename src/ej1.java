import java.util.Scanner;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Escriu una cadena: ");
        String cadena = input.nextLine();

        int longitud = cadena.length();

        System.out.println("La longitud de la cadena es: " + longitud);
    }
}