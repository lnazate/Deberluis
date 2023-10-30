import java.util.Random;

public class GeneradorYRastreador {
    private int nivelDificultad;
    private int tipoProblema;
    private Random random;

    public GeneradorYRastreador(int nivelDificultad, int tipoProblema) {
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
        this.random = new Random();
    }

    public int[] generarOperandos() {
        int limite = (int) Math.pow(10, nivelDificultad);
        return new int[]{random.nextInt(limite), random.nextInt(limite)};
    }

    public String generarPregunta(int operando1, int operando2) {
        return "¿Cuánto es " + operando1 + " + " + operando2 + "? ";
    }

    public boolean esRespuestaCorrecta(int operando1, int operando2, int respuestaUsuario) {
        return operando1 + operando2 == respuestaUsuario;
    }

}
