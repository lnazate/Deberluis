import java.util.Random;

public class GeneradorYRastreador {
    private int nivelDificultad;
    private int tipoProblema;
    Random random;

    public GeneradorYRastreador(int nivelDificultad, int tipoProblema) {
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
        this.random = new Random();
    }

    public int[] generarOperandos() {
        int max = (int) Math.pow(10, nivelDificultad) - 1;
        int min = (int) Math.pow(10, nivelDificultad - 1);
        int op1 = random.nextInt((max - min) + 1) + min;
        int op2 = random.nextInt((max - min) + 1) + min;
        return new int[] {op1, op2};
    }

    public String generarPregunta(int op1, int op2) {
        return "¿Cuánto es " + op1 + " + " + op2 + "?";
    }

    public boolean esRespuestaCorrecta(int op1, int op2, int respuestaUsuario) {
        return (op1 + op2) == respuestaUsuario;
    }

    public String generarMensajePositivo() {
        String[] mensajesPositivos = {
            "¡Muy bien!",
            "¡Excelente!",
            "¡Buen trabajo!",
            "¡Sigue así!"
        };
        int indiceAleatorio = random.nextInt(mensajesPositivos.length);
        return mensajesPositivos[indiceAleatorio];
    }

    public String generarMensajeNegativo() {
        String[] mensajesNegativos = {
            "No. Por favor intenta de nuevo.",
            "Incorrecto. Intenta una vez más.",
            "¡No te rindas!",
            "No. Sigue intentando."
        };
        int indiceAleatorio = random.nextInt(mensajesNegativos.length);
        return mensajesNegativos[indiceAleatorio];
    }

    public void mostrarRendimiento(int aciertos, int totalPreguntas) {
        double porcentaje = ((double) aciertos / totalPreguntas) * 100;
        if (porcentaje < 75) {
            System.out.println("Por favor pide ayuda adicional a tu instructor.");
        } else {
            System.out.println("Felicidades, estás listo para pasar al siguiente nivel!");
        }
    }
}
