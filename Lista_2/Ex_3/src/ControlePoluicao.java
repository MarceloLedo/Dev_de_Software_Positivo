public class ControlePoluicao {
	private double indicePoluicao;

    public ControlePoluicao(double indicePoluicao) {
        this.indicePoluicao = indicePoluicao;
    }

    public void emitirNotificacao() {
        if (indicePoluicao >= 0.06 && indicePoluicao <= 0.16) {
            System.out.println("Índice de poluição aceitável.");
        } else if (indicePoluicao > 0.16 && indicePoluicao < 0.25) {
            System.out.println("Índice de poluição acima do aceitável.");
        } else if (indicePoluicao >= 0.25 && indicePoluicao < 0.4) {
            System.out.println("Índice de poluição alto. Indústrias do grupo 1 devem reduzir atividades em 50%.");
        } else if (indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
            System.out.println("Índice de poluição crítico. Indústrias do grupo 1 e 2 devem suspender atividades.");
        } else if (indicePoluicao >= 0.5) {
            System.out.println("Índice de poluição em nível extremo. Todos os grupos de indústrias devem paralisar atividades.");
        }
    }
}
