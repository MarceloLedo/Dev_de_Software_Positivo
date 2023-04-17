public class Boleto {
	    
	    private double valorOriginal;
	    private int diasAtraso;
	    
	    public Boleto(double valorOriginal, int diasAtraso) {
	        this.valorOriginal = valorOriginal;
	        this.diasAtraso = diasAtraso;
	    }
	    
	    public double calcularValorTotal() {
	        double valorAtualizado = valorOriginal;
	        
	        // Calcula a multa de 5% caso o boleto esteja atrasado
	        if (diasAtraso > 0) {
	            valorAtualizado += valorOriginal * 0.05;
	        }
	        
	        // Calcula os juros diários de 1% sobre o valor atualizado
	        for (int i = 0; i < diasAtraso; i++) {
	            valorAtualizado += valorAtualizado * 0.01;
	        }
	        
	        return valorAtualizado;
	    }
	}

