public class Main {
    public static void main(String[] args) {

        Torcedor t = new Torcedor();
        Comentarista c = new Comentarista();
        LogPartida log = new LogPartida();

        Placar placar = new Placar(t, c, log);

        placar.atualizarResultado("Time A 1 x 0 Time B");
    }
}
