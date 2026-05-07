public class Placar {
    private Torcedor torcedor;
    private Comentarista comentarista;
    private LogPartida log;

    public Placar(Torcedor t, Comentarista c, LogPartida l) {
        this.torcedor = t;
        this.comentarista = c;
        this.log = l;
    }

    public void atualizarResultado(String resultado) {
        torcedor.atualizar(resultado);
        comentarista.atualizar(resultado);
        log.atualizar(resultado);
    }
}