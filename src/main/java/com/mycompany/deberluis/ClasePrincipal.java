import java.util.Scanner;
import java.util.Random;

public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Elige el nivel de dificultad (1, 2, ...): ");
        int nivelDificultad = entrada.nextInt();
        
        System.out.println("Elige el tipo de problema aritmético (1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Aleatorio): ");
        int tipoProblema = entrada.nextInt();
        

    }
}

