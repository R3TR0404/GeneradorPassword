import java.security.SecureRandom;

public class GeneradorPasword {

    private static final String MAYUS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*";

    private static final String TODOS = MAYUS + MINUS + NUMEROS + SIMBOLOS;

    public static String generar(int longitud) {
     SecureRandom random = new SecureRandom();
     StringBuilder password = new StringBuilder();

     for (int i=0; i < longitud; i++) {
         int index = random.nextInt(TODOS.length());
         password.append(TODOS.charAt(index));
     }

     return password.toString();

    }


}
