public class Comentarista {
    private String nome;

    public Comentarista(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        System.out.println("Placar do jogo atualizado: " + mensagem);
    }
}