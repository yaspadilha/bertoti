public class Main {
    public static void main(String[] args) {
        Desconto desconto = new DescontoPercentual();

        Pedido pedido = new Pedido(200.0, desconto);

        double descontoValor = pedido.calcularDesconto();
        double valorFinal = pedido.valorFinal();

        System.out.println("Desconto: " + descontoValor);
        System.out.println("Valor final: " + valorFinal);
    }
}