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
        
        GeneradorYRastreador generadorYRastreador = new GeneradorYRastreador(nivelDificultad, tipoProblema);
        
        int aciertos = 0;
        int intentos = 0;
        int totalPreguntas = 10;
        
        while (intentos < totalPreguntas) {
            int[] operandos = generadorYRastreador.generarOperandos();
            String pregunta = generadorYRastreador.generarPregunta(operandos[0], operandos[1]);
            
            boolean esRespuestaCorrecta = false;
            
            while (!esRespuestaCorrecta) {
                System.out.println(pregunta);
                int respuestaUsuario = entrada.nextInt();
                
                if (generadorYRastreador.esRespuestaCorrecta(operandos[0], operandos[1], respuestaUsuario)) {
                    aciertos++;
                    String mensajePositivo = generadorYRastreador.generarMensajePositivo();
                    System.out.println(mensajePositivo);
                    esRespuestaCorrecta = true;
                } else {
                    String mensajeNegativo = generadorYRastreador.generarMensajeNegativo();
                    System.out.println(mensajeNegativo);
                }
            }
            
            intentos++;
        }
        
        generadorYRastreador.mostrarRendimiento(aciertos, totalPreguntas);
        
        entrada.close();
    }
}

