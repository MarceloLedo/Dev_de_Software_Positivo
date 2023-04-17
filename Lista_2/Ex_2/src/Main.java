
public class Main {
	public static void main(String[] args) {
		Boleto boleto = new Boleto(259.90, 2);
		double valorTotal = boleto.calcularValorTotal();
		System.out.println("Valor total a ser pago: " + valorTotal);
    }
}

