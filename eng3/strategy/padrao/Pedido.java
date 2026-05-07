public class Pedido {

    private double valor;
    private Desconto desconto;

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularDesconto() {
        return desconto.calcularDesconto(valor);
    }

    public double valorFinal() {
        return valor - calcularDesconto();
    }
}