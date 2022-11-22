import java.util.Random;
import java.security.SecureRandom;

public class Num {

    public int numAleatorio() {
        Random numAleatorio = new Random(System.currentTimeMillis());
        int intAletorio = numAleatorio.nextInt(90);
        System.out.println(" ");
        System.out.println(" ");
        return intAletorio;
    }
}
