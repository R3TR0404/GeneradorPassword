//CARLOS ENRIQUE PEREZ GONZALEZ

public class Main {
    public static void main(String[] args) {

        // Generar contraseña
        String password = GeneradorPasword.generar(12);
        System.out.println("Password generada: " + password);

        // Evaluar
        String nivel = VerificadorPassword.evaluar(password);
        System.out.println("Nivel de seguridad: " + nivel);

        // Hash
        String hash = HashPassword.hash(password);
        System.out.println("Hash SHA-256: " + hash);
    }
}