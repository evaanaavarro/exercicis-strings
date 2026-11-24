public class ej2 {
    public static void main(String[] args) {

        String cadena = "google.com";

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (cadena.indexOf(letra) == i) {
                int contador = 0;

                for (int j = 0; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == letra) {
                        contador++;
                    }
                }

                System.out.println(letra + ": " + contador);
            }
        }
    }
}