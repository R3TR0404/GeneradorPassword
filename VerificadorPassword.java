public class VerificadorPassword {
    public static String evaluar (String password){
        int puntaje = 0;

        if(password.length() >=8) puntaje++;
        if (password.matches(".*[A-Z].*")) puntaje++;
        if (password.matches(".*[a-z].*")) puntaje++;
        if (password.matches(".*[0-9].*")) puntaje++;
        if (password.matches(".*[!@#$%^&*].*")) puntaje++;

        if (puntaje <= 2) return "Débil";
        else if (puntaje <= 4) return "Media";
        else return "Fuerte";
    }

}
