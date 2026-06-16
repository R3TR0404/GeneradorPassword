import java.security.MessageDigest;
public class HashPassword {
    public static String hash(String password){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());

            StringBuilder hex = new StringBuilder();
            for(byte b : hashBytes){
                hex.append(String.format("%02x",b));
            }

            return hex.toString();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
