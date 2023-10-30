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

    public String generarMensajePositivo() {
        String[] mensajesPositivos = {
            "¡Muy bien!",
            "¡Excelente!",
            "¡Buen trabajo!",
            "¡Sigue así!"
        };
        return mensajesPositivos[random.nextInt(mensajesPositivos.length)];
    }

    public String generarMensajeNegativo() {
        String[] mensajesNegativos = {
            "No. Por favor intenta de nuevo.",
            "Incorrecto. Intenta una vez más.",
            "¡No te rindas!",
            "No. Sigue intentando."
        };
        return mensajesNegativos[random.nextInt(mensajesNegativos.length)];
    }


    }
}
