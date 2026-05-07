public class Main {
    public static void main(String[] args) {
        Placar placar = new Placar();

        Torcedor t1 = new Torcedor("Thiago");
        Comentarista c1 = new Comentarista("Tiago Leifert");
        LogPartida log = new LogPartida();

        placar.adicionarObservador(t1);
        placar.adicionarObservador(c1);
        placar.adicionarObservador(log);

        placar.setResultado("Corinthians 1 x 0 Palmeiras");
        placar.setResultado("Corinthians 2 x 0 Palmeiras");
    }
}
