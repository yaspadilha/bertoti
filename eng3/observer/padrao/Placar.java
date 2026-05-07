public class Placar {
    private List<Observador> observadores = new ArrayList<>();
    private String resultado;

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void setResultado(String novoResultado) {
        this.resultado = novoResultado;
        notificarObservadores();
    }

    public void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(resultado);
        }
    }
}