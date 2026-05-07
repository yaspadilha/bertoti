public class DescontoCupom implements Desconto {
    double valorCupom;

    public DescontoCupom(double valorCupom) {
        this.valorCupom = valorCupom;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valorCupom;
    }
}