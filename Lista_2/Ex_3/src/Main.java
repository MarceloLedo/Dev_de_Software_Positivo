import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o Indice de Poluição");
	double id=0;
	id =sc.nextDouble();
	ControlePoluicao controle = new ControlePoluicao(id);
	controle.emitirNotificacao();
}
}