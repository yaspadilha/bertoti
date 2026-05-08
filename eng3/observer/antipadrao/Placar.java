public class Placar {
    private Torcedor torcedor;
    private Comentarista comentarista;
    private LogPartida log;

    public Placar(Torcedor t, Comentarista c, LogPartida l) {
        this.torcedor = t;
        this.comentarista = c;
        this.log = l;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(resultado);
        }
    }
}
