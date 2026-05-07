public class Log implements Observador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Atualização -> " + mensagem);
    }
}