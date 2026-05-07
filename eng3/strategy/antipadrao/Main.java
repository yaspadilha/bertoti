public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(200.00, "percentual");

        double desconto = pedido.calcularDesconto();
        double valorFinal = pedido.valorDescontado();

        System.out.println("Você recebeu um desconto de " + desconto + "R$. Seu pedido ficou em: " + valorFinal + "R$.");
    } 
}