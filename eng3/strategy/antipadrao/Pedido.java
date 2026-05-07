public class Pedido {
    double valor;
    String tipoDesconto;

    public Pedido(double valor, String tipoDesconto) {
        this.valor = valor;
        this.tipoDesconto = tipoDesconto;
    }

    public String calcularDesconto() {
        if (tipoDesconto.equals("percentual")) {
            return valor * 0.10
        }
        if (tipoDesconto.equals("fixo")) {
            return valor - 20.00
        }
        if (tipoDesconto.equals("fidelidade")) {
            return valor * 0.15
        }
        return "Esse produto não possui opção de desconto."
    }

    public double valorDescontado() {
        double desconto = calcularDesconto();
        return valor - desconto;
    }
}