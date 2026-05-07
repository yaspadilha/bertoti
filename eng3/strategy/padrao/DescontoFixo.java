public class DescontoFixo implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return 20.00;
    }
}