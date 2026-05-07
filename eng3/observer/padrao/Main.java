public class Main {
    public static void main(String[] args) {
        Placar placar = new Placar();

        Torcedor t1 = new Torcedor("João");
        Comentarista c1 = new Comentarista("Carlos");
        LogPartida log = new LogPartida();

        placar.adicionarObservador(t1);
        placar.adicionarObservador(c1);
        placar.adicionarObservador(log);

        placar.setResultado("Time A 1 x 0 Time B");
        placar.setResultado("Time A 2 x 0 Time B");
    }
}