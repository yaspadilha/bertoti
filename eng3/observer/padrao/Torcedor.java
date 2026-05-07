public class Torcedor implements Observador {
    private String nome;

    public Torcedor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " você recebeu uma notificação: " + mensagem);
    }
}