public class Torcedores {
    private String nome;

    public Torcedor(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        System.out.println(nome + " você recebeu uma notificação: " + mensagem);
    }
}