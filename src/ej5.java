public class ej5 {
    public static void main(String[] args) {

        String[] palabras = {"casa", "ordinador", "gos", "programació", "sol"};

        String masLarga = palabras[0];

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() > masLarga.length()) {
                masLarga = palabras[i];
            }
        }

        System.out.println("La paraula més llarga és: " + masLarga);
        System.out.println("La seva longitud és: " + masLarga.length());
    }
}
