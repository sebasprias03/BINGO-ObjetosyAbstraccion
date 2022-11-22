import java.sql.SQLOutput;
import java.util.Scanner;

public class sorteo {
    public static void jugar() {
        Num bola1 = new Num();
        Carton tabla = new Carton();

        int[] casillero = new int[90];
        Scanner input = new Scanner(System.in);
        System.out.println("Sortear numero: ");
        input.nextLine();
        tabla.mostrarCarton();

        int i = 0;
        int numero;
        while(true){
            do{
                tabla.mostrarCarton();
                System.out.println("::..Tabla..::");
                numero = bola1.numAleatorio();
                casillero[i] = numero;
                System.out.println("El numero sorteado es: "+ casillero[i]);
                System.out.println("Press Enter \n");
                input.nextLine();
                i ++;

            }while(casillero[i] != numero);

        }



    }
}
