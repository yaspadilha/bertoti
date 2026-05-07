public class Comentarista implements Observador {
    private String nome;

    public Comentarista(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Placar do jogo atualizado: " + mensagem);
    }
}