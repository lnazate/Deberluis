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

}
